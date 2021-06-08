package com.yaozhou.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by WXHang on HANG at 2021/6/2 22:40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private int bookId;
    private String bookName;
    private int bookCounts;
    private String detail;
}
