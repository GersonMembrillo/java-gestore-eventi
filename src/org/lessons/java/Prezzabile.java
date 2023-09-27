package org.lessons.java;

import java.math.BigDecimal;

public interface Prezzabile {

	public BigDecimal getPrezzo();
	public String getFormattedPrezzo();
	public void setPrezzo(BigDecimal prezzo);
}
