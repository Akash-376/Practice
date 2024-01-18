package com.masai;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
//@Primary
public class B {
  public void funB() {
        System.out.println("inside funB of B");

    }
}
