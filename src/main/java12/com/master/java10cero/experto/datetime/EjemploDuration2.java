package com.master.java10cero.experto.datetime;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class EjemploDuration2 {

	public static void main(String[] args) throws InterruptedException {
		
		Instant i1 = Instant.now();
		
		TimeUnit.SECONDS.sleep(2);
		
		Instant i2 = Instant.now();
		
		Duration tiempo = Duration.between(i1, i2);
		
		System.out.println("Retraso que existe: " + tiempo);
	}
}
