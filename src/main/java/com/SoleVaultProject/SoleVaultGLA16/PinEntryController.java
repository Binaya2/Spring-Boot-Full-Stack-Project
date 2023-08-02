package com.SoleVaultProject.SoleVaultGLA16;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class PinEntryController {

    private static final int VALID_PIN = 9876;

    @PostMapping("/verify-pin")
    @ResponseBody
    public boolean verifyPin(@RequestParam("pin") int enteredPin) {
        return VALID_PIN == (enteredPin);
    }
}