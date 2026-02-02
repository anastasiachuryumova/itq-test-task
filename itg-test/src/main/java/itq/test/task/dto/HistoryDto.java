package itq.test.task.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import itq.test.task.entity.enums.Action;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.time.ZonedDateTime;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "История изменения документа", type = "object")
public class HistoryDto {
    @Schema(description = "id")
    @NotEmpty
    private Long id;

    @Schema(description = "author")
    private String author;

    @Schema(description = "time")
    private ZonedDateTime time;

    @Schema(description = "action")
    private Action action;

    @Schema(description = "comment")
    private String comment;

    @Schema(description = "document")
    private DocumentDto document;
}
