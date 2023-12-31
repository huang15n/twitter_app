package cst.assignment.twitter.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name = "subscription")
@Data
public class Subscription {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "subscriptionId")
	private Integer subscriptionId;

	@ManyToOne
	@JoinColumn(name = "subscriberId")
	private User subscriber;

	@ManyToOne
	@JoinColumn(name = "producerId")
	private User producer;
}
