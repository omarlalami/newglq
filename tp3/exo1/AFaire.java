package exo1;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Documented
// si on ne met pas target on peut laccrocher partout
@Retention(RetentionPolicy.SOURCE)
public @interface AFaire {
	
	String descrption_tache() default "";
	String nom_developpeur();
	String d() default "";
	NIVEAU niveau() default NIVEAU.NORMAL;
	
	public enum NIVEAU {
		MINEUR, NORMAL, MAJEUR, CRITIQUE
	}

}
