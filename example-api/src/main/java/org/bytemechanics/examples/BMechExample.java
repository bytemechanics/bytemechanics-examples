/*
 * Copyright 2018 Byte Mechanics.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.bytemechanics.examples;

import org.bytemechanics.standalone.ignite.Ignitable;
import org.bytemechanics.standalone.ignite.Standalone;

/**
 *
 * @author afarre
 */
public final class BMechExample implements Ignitable{

	@Override
	public void beforeStartup() {
		System.out.println("before-startup");
	}
	@Override
	public void startup() {
		System.out.println("startup");
	}
	@Override
	public void afterStartup() {
		System.out.println("after-startup");
	}


	@Override
	public void beforeShutdown() {
		System.out.println("before-shutdown");
	}
	@Override
	public void shutdown() {
		System.out.println("shutdown");
	}
	@Override
	public void afterShutdown() {
		System.out.println("after-shutdown");
	}


	public static final void main(final String... _args){
		Standalone.builder()
					.arguments(_args)
					.supplier(BMechExample::new)
					.parameters(Parameters.class)
					.name("BMech-Example")
				.build()
					.ignite();
	}
}
