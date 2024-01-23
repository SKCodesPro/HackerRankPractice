package org.example.functionalpractice;

@FunctionalInterface
public interface PrinterInterface <T> {
T print(T value);
}
