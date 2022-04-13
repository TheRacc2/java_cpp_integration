package com.company;

import com.sun.jna.Library;
import com.sun.jna.Native;
import sun.misc.VM;

public class Main {
    public interface JavaCPP extends Library {
        static JavaCPP init() {
            System.load("C:\\your\\path\here\\java_cpp_integration.dll");
            return Native.load("java_cpp_integration", JavaCPP.class);
        }

        JavaCPP instance = init();

        void MessageBoxCPP(String text);
    }

    public static void main(String[] args) {
	    JavaCPP.instance.MessageBoxCPP("testing my balls!");
    }
}
