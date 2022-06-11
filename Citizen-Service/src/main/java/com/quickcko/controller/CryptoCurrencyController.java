package com.quickcko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.quickcko.model.Author;
import com.quickcko.model.Response;
import com.quickcko.service.CryptoCurrencyService;

@Controller
public class CryptoCurrencyController {
    
	@Autowired
	private CryptoCurrencyService cryptoCurrencyService;
	
	@GetMapping(path = "/")	
	public ModelAndView  hello(Model model) {
		return new ModelAndView("home");
	}
	
	@GetMapping(path = "crypto/tickers")	
	public String getAllCoinTicker(Model model) {
		Response cryptoCurrency = cryptoCurrencyService.getAllCoinTicker();
		if(cryptoCurrency.getStatusCode()==500 ) {
			model.addAttribute("msg",cryptoCurrency.getMsg());
			return "home";
		}
		model.addAttribute("data",cryptoCurrency.getData());
		return  "home";
	}
	
	@GetMapping(path = "crypto/ticker/id/{id}")	
	public String getCoinTickerById(@PathVariable Integer id,Model model) {
		Response cryptoCurrency = cryptoCurrencyService.getCoinTickerById(id);
		model.addAttribute("data",cryptoCurrency.getData());
		return  "home";
	}
	
	@GetMapping(path = "crypto/author")	
	public String getAuthor(Model model) {
		Author author =new Author("Chetan Dahule", "Java Developer", "3.6", "");
		model.addAttribute("author",author);
		return  "home";
	}
}
