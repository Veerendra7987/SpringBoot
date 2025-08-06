package com.xits.firstclaas.Customer;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {
    @GetMapping("/validform")
    public String validform(Model model)
    {
        model.addAttribute("custdata",new Customer());
        return "valid";
    }
    @PostMapping("/process")
    public String process(@Valid @ModelAttribute("custdata") Customer custdata, BindingResult result)
    {
        if(result.hasErrors())
            return "valid";
        else {
            System.out.println(custdata);
            return "datasave";
        }
    }
}
