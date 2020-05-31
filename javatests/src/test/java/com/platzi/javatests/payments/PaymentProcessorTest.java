package com.platzi.javatests.payments;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class PaymentProcessorTest {
	
	private PaymentGateway paymentGateway;
	private PaymentProcessor paymentProcessor;
	
	@Before
	public void setup() {
		
		paymentGateway = Mockito.mock(PaymentGateway.class);
		paymentProcessor = new PaymentProcessor(paymentGateway);
		
	}

	@Test
	public void payment_is_correct() {
		
		// PREPARANDO EL ESCENARIO
		Mockito.when(paymentGateway.requestPayment((PaymentRequest) Mockito.any()))
			    .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));
		
		// LLAMANDO AL MÉTODO QUE QUEREMOS PROBAR
		boolean result = paymentProcessor.makePayment(1000);
		
		// COMPROBACIÓN DEL RESULTADO
		assertTrue(result);
	}
	
	@Test
	public void payment_is_wrong() {
		
		
		Mockito.when(paymentGateway.requestPayment((PaymentRequest) Mockito.any()))
			    .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
		
		
		assertFalse(paymentProcessor.makePayment(1000));
	}

}
