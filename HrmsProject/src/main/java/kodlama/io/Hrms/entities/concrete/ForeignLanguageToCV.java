package kodlama.io.Hrms.entities.concrete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "foreign_languages_cv")
@NoArgsConstructor
@AllArgsConstructor

public class ForeignLanguageToCV extends Base {

	@Column(name = "language")
	private String language;
	
	@Min(value = 1)
	@Max(value = 5)
	@Column(name = "level")
	private int level;

	@ManyToOne()
	@JoinColumn(name = "jobseeker_id")
	private Jobseeker jobseeker;
}
