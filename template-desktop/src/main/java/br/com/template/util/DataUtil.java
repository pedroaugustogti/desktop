package br.com.template.util;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



/**
 * The Class DataUtil.
 */
public final class DataUtil {

	
	private DataUtil(){
	}
	
	public static int ano(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.YEAR);
	}

	public static int mes(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MONTH);
	}

	public static int hora(Date data) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		return calendar.get(Calendar.HOUR_OF_DAY);
	}
	
	public static int dia(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.DAY_OF_MONTH);
	}
	
	public static Date criaData(int ano, int mes, int dia) {
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(Calendar.YEAR, ano);
		calendar.set(Calendar.MONTH, mes);
		calendar.set(Calendar.DAY_OF_MONTH, dia);
		
		return calendar.getTime();
	}
	
	public static Calendar criaDataCalendar(int ano, int mes, int dia) {
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(Calendar.YEAR, ano);
		calendar.set(Calendar.MONTH, mes);
		calendar.set(Calendar.DAY_OF_MONTH, dia);
		
		return calendar;
	}
	
	public static Date criaData(int ano, int mes) {
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(Calendar.YEAR, ano);
		calendar.set(Calendar.MONTH, mes);
		calendar.set(Calendar.DAY_OF_MONTH, BigInteger.ZERO.intValue());
		
		return calendar.getTime();
	}
	
	public static Date criaData(int ano) {
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(Calendar.YEAR, ano);
		calendar.set(Calendar.MONTH, BigInteger.ZERO.intValue());
		calendar.set(Calendar.DAY_OF_MONTH, BigInteger.ZERO.intValue());
		
		return calendar.getTime();
	}
	
	public static int maiorDiaDoMes(int ano, int mes) {
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(Calendar.YEAR, ano);
		calendar.set(Calendar.MONTH, mes);
		
		return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
	}

	@SuppressWarnings("deprecation")
	public static void setHora(Date data, int hora) {
		data.setHours(hora);
	}

	public static Date criaData(long tempoOcioso) {
		
		Calendar date = Calendar.getInstance();
		
		date.set(Calendar.MILLISECOND, (int)tempoOcioso);
		
		return date.getTime();
	}

	public static String converteMilisegundosEmTempoFormatado(long milisegundos) {
		
		return new SimpleDateFormat("mm:ss").format(milisegundos);
	}
}