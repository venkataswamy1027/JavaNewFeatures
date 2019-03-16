package com.test;

@FunctionalInterface
public interface GenericInterface<T> {
	T compute(T t);
}
