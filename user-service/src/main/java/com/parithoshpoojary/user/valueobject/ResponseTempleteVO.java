package com.parithoshpoojary.user.valueobject;

import com.parithoshpoojary.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTempleteVO {
    private User user;
    private Department department;
}
