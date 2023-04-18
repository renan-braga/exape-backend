package br.com.ifsp.exape.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Chamado {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull(message = "A data de criação é obrigatória")
    private String dataCriacao;

    @NotEmpty(message = "O título é obrigatório")
    private String titulo;

    @NotEmpty(message = "A descrição é obrigatória")
    private String descricao;

    @NotNull(message = "O usuário é obrigatório")
    @ManyToOne
    private Usuario usuario;

    @NotNull(message = "O status é obrigatório")
    @Enumerated(EnumType.STRING)
    private Status status;

}
