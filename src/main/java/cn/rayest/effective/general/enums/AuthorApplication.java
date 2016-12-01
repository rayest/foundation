package cn.rayest.effective.general.enums;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Rayest on 2016/12/1 0001.
 */
public class AuthorApplication {
    public static void main(String[] args) {
        Collection<Author> authors = Arrays.asList(Author.values());
        for (Author author : authors) {
            System.out.print(author + " ");
        }
    }
}
