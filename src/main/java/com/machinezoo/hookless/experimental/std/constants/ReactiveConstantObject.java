// Part of Hookless: https://hookless.machinezoo.com
package com.machinezoo.hookless.experimental.std.constants;

/*
 * With default configuration, object must satisfy requirements of ReactiveVersionObject.
 */
public interface ReactiveConstantObject<T> extends ReactiveConstant {
	@Override
	default ReactiveConstantObjectConfig<T> reactiveConfig() {
		return new ReactiveConstantObjectConfig<>(this);
	}
	T compute();
	default T get() {
		touch();
		return compute();
	}
}
