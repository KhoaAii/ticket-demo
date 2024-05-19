package com.example.ticketsystem.dto.user.response;

import com.example.ticketsystem.entity.User;
import com.example.ticketsystem.enums.Role;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Accessors(chain = true)
public class UserResponse {

        private String id;
        private String fullname;
        private String email;
        private String phone;
        private String address;
        private LocalDateTime dob;
        private LocalDateTime createdAt;
        private boolean gender;
        private boolean inactive;
        private Role role;

        public UserResponse(User user) {
                this.id = user.getId().toString();
                this.fullname = user.getFullname();
                this.email = user.getEmail();
                this.phone = user.getPhone();
                this.address = user.getAddress();
                this.dob = user.getDob();
                this.createdAt = user.getCreatedAt();
                this.gender = user.isGender();
                this.inactive = user.isInactive();
                this.role = user.getRole();
        }
}
