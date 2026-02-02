package itq.test.task.entity;

import itq.test.task.entity.enums.Status;
import lombok.*;
import jakarta.persistence.*;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "register", schema = "itq_task")
public class Register {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private Status status = Status.APPROVED;

    @OneToOne(mappedBy = "register")
    private Document document;
}
