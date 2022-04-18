package vn.name.bao.api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@RestController
public class User {
    @GetMapping("/province")
    public List<Province> getProvinces(@RequestParam String keyword ){
        return array.stream().filter(e->deAccent(e.getName()).contains(deAccent(keyword))).collect(Collectors.toList());
    }

      ArrayList<Province> array = new ArrayList<>(Arrays.asList(
              new Province(1, "Hồ Chí Minh"),
              new Province(2, "Hà Nội"),
              new Province(3, "Đà Nẵng"),
              new Province(4, "Bình Dương"),
              new Province(5, "Đồng Nai"),
              new Province(6, "Khánh Hòa"),
              new Province(7, "Hải Phòng"),
              new Province(8, "Long An"),
              new Province(9, "Quảng Nam"),
              new Province(10, "Bà Rịa Vũng Tàu"),
              new Province(11, "Đắk Lắk"),
              new Province(12, "Cần Thơ"),
              new Province(13, "Bình Thuận"),
              new Province(14, "Lâm Đồng"),
              new Province(15, "Thừa Thiên Huế"),
              new Province(16, "Kiên Giang"),
              new Province(17, "Bắc Ninh"),
              new Province(18, "Quảng Ninh"),
              new Province(19, "Thanh Hóa"),
              new Province(20, "Nghệ An"),
              new Province(21, "Hải Dương"),
              new Province(22, "Gia Lai"),
              new Province(23, "Bình Phước"),
              new Province(24, "Hưng Yên"),
              new Province(25, "Bình Định"),
              new Province(26, "Tiền Giang"),
              new Province(27, "Thái Bình"),
              new Province(28, "Bắc Giang"),
              new Province(29, "Hòa Bình"),
              new Province(30, "An Giang"),
              new Province(31, "Vĩnh Phúc"),
              new Province(32, "Tây Ninh"),
              new Province(33, "Thái Nguyên"),
              new Province(34, "Lào Cai"),
              new Province(35, "Nam Định"),
              new Province(36, "Quảng Ngãi"),
              new Province(37, "Bến Tre"),
              new Province(38, "Đắk Nông"),
              new Province(39, "Cà Mau"),
              new Province(40, "Vĩnh Long"),
              new Province(41, "Ninh Bình"),
              new Province(42, "Phú Thọ"),
              new Province(43, "Ninh Thuận"),
              new Province(44, "Phú Yên"),
              new Province(45, "Hà Nam"),
              new Province(46, "Hà Tĩnh"),
              new Province(47, "Đồng Tháp"),
              new Province(48, "Sóc Trăng"),
              new Province(49, "Kon Tum"),
              new Province(50, "Quảng Bình"),
              new Province(51, "Quảng Trị"),
              new Province(52, "Trà Vinh"),
              new Province(53, "Hậu Giang"),
              new Province(54, "Sơn La"),
              new Province(55, "Bạc Liêu"),
              new Province(56, "Yên Bái"),
              new Province(57, "Tuyên Quang"),
              new Province(58, "Điện Biên"),
              new Province(59, "Lai Châu"),
              new Province(60, "Lạng Sơn"),
              new Province(61, "Hà Giang"),
              new Province(62, "Bắc Kạn"),
              new Province(63, "Cao Bằng"))) ;

    public String deAccent(String str) {
        str = str.toLowerCase();
        System.out.println(str);
        String nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(nfdNormalizedString).replaceAll("");
    }
}
