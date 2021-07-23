package eu.cec.digit.comref.interview.persistent.domain;

import java.io.Serializable;

import javax.persistence.*;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ISP")
public class InternetServiceProvider implements Serializable, Comparable<InternetServiceProvider> {

	private static final long serialVersionUID = -4292369331387884243L;

	@Id
	@Column(name = "NAME")
	private String name;

	@Column(name = "SPEED")
	private Integer speed;

	@Column(name = "AVAILABLE")
	private Boolean available;

	@OneToMany(fetch=FetchType.LAZY,
			   cascade = CascadeType.ALL,
	           mappedBy = "internetServiceProvider")
	private List<Town> townList;


	@Override
	public int compareTo(InternetServiceProvider o) {
		return this.getName().compareTo(o.getName());
	}
}
