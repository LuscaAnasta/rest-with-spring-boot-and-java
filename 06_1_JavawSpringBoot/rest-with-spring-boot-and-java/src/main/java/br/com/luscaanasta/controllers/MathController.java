package br.com.luscaanasta.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.luscaanasta.converters.NumbersConverters;
import br.com.luscaanasta.exceptions.UnsupportedMathOperationException;
import br.com.luscaanasta.math.SimpleMath;

@RestController

public class MathController {
	
	private final AtomicLong counter = new AtomicLong();
	
	private SimpleMath math = new SimpleMath();
	@RequestMapping(value = "/sum/{n1}/{n2}", method=RequestMethod.GET)
	public Double sum(
			@PathVariable(value = "n1") String n1,
			@PathVariable(value = "n2") String n2
			)throws Exception {
		
		
		if(!NumbersConverters.isNumeric(n1) || !NumbersConverters.isNumeric(n2)) {
			throw new UnsupportedMathOperationException("Please set a numeric value.");
		}
		return math.sum(NumbersConverters.convertToDouble(n1),NumbersConverters.convertToDouble(n2));
	}
	@RequestMapping(value = "/sub/{n1}/{n2}", method=RequestMethod.GET)
	public Double sub(
			@PathVariable(value = "n1") String n1,
			@PathVariable(value = "n2") String n2
			)throws Exception {
		
		
		if(!NumbersConverters.isNumeric(n1) || !NumbersConverters.isNumeric(n2)) {
			throw new UnsupportedMathOperationException("Please set a numeric value.");
		}
		return math.sub(NumbersConverters.convertToDouble(n1),NumbersConverters.convertToDouble(n2));
	}
	@RequestMapping(value = "/div/{n1}/{n2}", method=RequestMethod.GET)
	public Double div(
			@PathVariable(value = "n1") String n1,
			@PathVariable(value = "n2") String n2
			)throws Exception {
		
		
		if(!NumbersConverters.isNumeric(n1) || !NumbersConverters.isNumeric(n2)) {
			throw new UnsupportedMathOperationException("Please set a numeric value.");
		}
		return math.div(NumbersConverters.convertToDouble(n1),NumbersConverters.convertToDouble(n2));
	}
	@RequestMapping(value = "/multi/{n1}/{n2}", method=RequestMethod.GET)
	public Double multi(
			@PathVariable(value = "n1") String n1,
			@PathVariable(value = "n2") String n2
			)throws Exception {
		
		
		if(!NumbersConverters.isNumeric(n1) || !NumbersConverters.isNumeric(n2)) {
			throw new UnsupportedMathOperationException("Please set a numeric value.");
		}
		return math.multi(NumbersConverters.convertToDouble(n1),NumbersConverters.convertToDouble(n2));
	}
	@RequestMapping(value = "/mean/{n1}/{n2}", method=RequestMethod.GET)
	public Double mean(
			@PathVariable(value = "n1") String n1,
			@PathVariable(value = "n2") String n2
			)throws Exception {
		
		
		if(!NumbersConverters.isNumeric(n1) || !NumbersConverters.isNumeric(n2)) {
			throw new UnsupportedMathOperationException("Please set a numeric value.");
		}
		
		return math.mean(NumbersConverters.convertToDouble(n1),NumbersConverters.convertToDouble(n2));
	}
	@RequestMapping(value = "/squareroot/{n1}", method=RequestMethod.GET)
	public Double squareRoot(
			@PathVariable(value = "n1") String n1
			)throws Exception {
		
		
		if(!NumbersConverters.isNumeric(n1)) {
			throw new UnsupportedMathOperationException("Please set a numeric value.");
		}
		
		return math.squareRoot(NumbersConverters.convertToDouble(n1));
	}

	
}