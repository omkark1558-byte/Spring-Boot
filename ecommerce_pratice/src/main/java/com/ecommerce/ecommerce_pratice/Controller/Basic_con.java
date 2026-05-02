package com.ecommerce.ecommerce_pratice.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Basic_con {


        @GetMapping("/private")
        public String add(){
        return "Private API ✅`";
        }

        @GetMapping("/user/dashboard")
        public String get1()
        {
                return "User Dashboard 👤";
        }
        @GetMapping("/admin/dashboard")
        public String get2()
        {
                return "Admin Dashboard 🔒";
        }

        @GetMapping("/public")
        public String get()
        {
            return "Public API ⚠️";
         }



}
