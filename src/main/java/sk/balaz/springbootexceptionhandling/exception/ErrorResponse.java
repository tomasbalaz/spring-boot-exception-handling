package sk.balaz.springbootexceptionhandling.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ErrorResponse {

    private String message;

    private LocalDateTime timestamp;
}
