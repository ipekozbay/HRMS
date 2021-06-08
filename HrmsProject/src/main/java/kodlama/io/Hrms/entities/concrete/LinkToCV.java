package kodlama.io.Hrms.entities.concrete;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data

@Table(name = "links_cv")
@AllArgsConstructor
@NoArgsConstructor

public class LinkToCV extends Base {
	@Column(name = "url")
	private String url;

	@ManyToOne()
	@JoinColumn(name = "jobseeker_id")
	private Jobseeker jobseeker;

}
