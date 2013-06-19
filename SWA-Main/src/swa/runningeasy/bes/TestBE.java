/**
 * 
 */
package swa.runningeasy.bes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
@Entity
public class TestBE {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long	id;
	private String	summary;
	private String	description;

	public String getSummary() {
		return summary;
	}

	public void setSummary(final String summary) {
		this.summary = summary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Todo [summary=" + summary + ", description=" + description + "]";
	}

	public final Long getId() {
		return id;
	}
}