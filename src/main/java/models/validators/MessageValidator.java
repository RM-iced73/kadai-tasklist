package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Task;

public class MessageValidator {
    public static List<String> validate(Task m) {
        List<String> errors = new ArrayList<String>();

        String content_error = validateContent(m.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        return errors;
    }

    // メッセージの必須入力チェック
    private static String validateContent(String content) {
        if(content == null || content.equals("")) {
            return "タスクを入力してください。";
        }

        return "";
    }
}
