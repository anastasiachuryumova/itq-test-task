package itq.test.task.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import itq.test.task.entity.enums.OperationStatus;
import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Документ отправленный на согласование/утверждение", type = "object")
public class SubmitDocumentDto {
    @Schema(description = "id")
    private Long id;

    @Schema(description = "operationStatus")
    private OperationStatus operationStatus;
}
