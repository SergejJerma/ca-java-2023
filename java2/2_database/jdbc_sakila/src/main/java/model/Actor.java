package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SourceType;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "actor")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Actor {

    @Id
    @Generated()
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "actor_id", columnDefinition = "SMALLINT")
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @UpdateTimestamp(source = SourceType.DB)
    @Column(name = "last_update", updatable = false)
    private LocalDateTime lastUpdate;

    public Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
