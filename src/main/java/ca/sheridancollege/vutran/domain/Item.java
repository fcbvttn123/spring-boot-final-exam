package ca.sheridancollege.vutran.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data 
@AllArgsConstructor 
@NoArgsConstructor 
@RequiredArgsConstructor 
@Entity 
public class Item {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NonNull
	private String title;
	@NonNull
	private int price;
	@NonNull
	private LocalDate dateTime;
}
