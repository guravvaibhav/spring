package hibernate.inheritance.TABLE_PER_CLASS;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int pId;
}
