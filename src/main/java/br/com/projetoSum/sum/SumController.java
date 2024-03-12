package br.com.projetoSum.sum;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {

    @RequestMapping(value = "/sum/{num1}/{num2}", method = RequestMethod.GET)
    public int sum(
            @PathVariable(value = "num1") int num1,
            @PathVariable(value = "num2") int num2)  {
        return num1 + num2;
    }

    }
