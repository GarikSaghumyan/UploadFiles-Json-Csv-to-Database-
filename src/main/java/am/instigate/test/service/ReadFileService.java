package am.instigate.test.service;

import am.instigate.test.entity.User;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ReadFileService {
    List<User> findAll();

    boolean saveDataFromUploadFile(MultipartFile file);
}
