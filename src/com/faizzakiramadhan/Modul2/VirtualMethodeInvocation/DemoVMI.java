package com.faizzakiramadhan.Modul2.VirtualMethodeInvocation;

import org.w3c.dom.xpath.XPathResult;

public class DemoVMI {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parentchild = new Parent();

        child.getData();
        parentchild.getData();
    }
}
