/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package security;

import org.springframework.data.jpa.repository.JpaRepository;
import sumdu.edu.ua.webstudent.res.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);

}
