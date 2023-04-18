package br.com.ifsp.exape.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Interacao {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull(message = "O status da interação é obrigatório")
    private String statusChamado;

    @NotNull(message = "O timestamp da interação é obrigatório")
    private String timestamp;

    @NotBlank(message = "O comentário da interação é obrigatório")
    private String comentario;

    @NotNull(message = "O chamado é obrigatório")
    @ManyToOne
    private Chamado chamado;

    @NotNull(message = "O usuário é obrigatório")
    @ManyToOne
    private Usuario usuario;
}
