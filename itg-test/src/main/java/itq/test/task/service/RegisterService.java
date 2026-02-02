package itq.test.task.service;

import itq.test.task.dto.SubmitDocumentDto;
import itq.test.task.entity.Document;
import itq.test.task.entity.Register;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface RegisterService {

    List<SubmitDocumentDto> approve(List<Long> ids);

    CompletableFuture<List<SubmitDocumentDto>> parallelApproveOne(Long id, int threads, int attempts) throws InterruptedException;

    CompletableFuture<List<SubmitDocumentDto>> parallelApproveTwo(Long id);

    Register save(Document document);
}
