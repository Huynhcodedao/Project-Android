package com.example.project;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.Serializable;
public class QuestionBank implements Serializable{
    private List<Question> lichsu;
    private List<Question> dialy;
    private List<Question> khoahoc;
    private List<Question> nghethuat;
    private List<Question> moitruong;
    private List<Question> toanhoc;
    private List<Question> vanhoc;
    private List<Question> tienganh;
    private List<Question> thethao;
    private List<Question> all;

    public QuestionBank() {
        ThemCauHoiLichsu();
        ThemCauHoiDialy();
        ThemCauHoiKhoaHoc();
        ThemCauHoiNgheThuat();
        ThemCauHoiMoiTruong();
        ThemCauHoiToanHoc();
        ThemCauHoiVanHoc();
        ThemCauHoiTiengAnh();
        ThemCauHoiTheThao();
        ThemCauHoiAll();
    }

    private void ThemCauHoiLichsu() {
        lichsu = new ArrayList<>();

        lichsu.add(new  Question(1,"Ai là người sáng lập ra Đảng Cộng sản Việt Nam?", Arrays.asList("Hồ Chí Minh", "Trần Hưng Đạo", "Lê Lợi", "Ngô Quyền"), 0, 1));
        lichsu.add(new Question(2,"Năm nào Việt Nam chính thức giành độc lập?", Arrays.asList("1945", "1954", "1975", "1986"), 2, 1));
        lichsu.add(new Question(3,"Ai là người đầu tiên trở thành Tổng Bí thư của Đảng Cộng sản Việt Nam?", Arrays.asList("Lê Duẩn", "Hồ Chí Minh", "Nguyễn Văn Linh", "Trường Chinh"), 0, 0));
        lichsu.add(new Question(4,"Sự kiện nào được coi là mốc quan trọng đánh dấu sự chia ly giữa Bắc và Nam Việt Nam?", Arrays.asList("Biên giới 17", "Chiến tranh thế giới thứ hai kết thúc", "Cuộc di cư lớn 1954", "Chiến tranh Việt Nam kết thúc"), 2, 1));
        lichsu.add(new Question(5,"Dự án nào làm nền tảng cho sự phát triển kinh tế Việt Nam sau năm 1986?", Arrays.asList("Dự án Cần Thơ", "Dự án Hòa Bình", "Dự án Đổi mới", "Dự án Thăng Long"), 2, 1));
        lichsu.add(new Question(6,"Tổ hợp di tích nào ở Việt Nam được UNESCO công nhận là di sản thế giới?", Arrays.asList("Vịnh Hạ Long", "Hồ Gươm", "Thành cổ Huế", "Chùa Một Cột"), 0, 1));
        lichsu.add(new Question(7,"Chủ tịch nước Việt Nam đầu tiên là ai?", Arrays.asList("Hồ Chí Minh", "Trường Chinh", "Tôn Đức Thắng", "Nguyễn Phú Trọng"), 2, 1));
        lichsu.add(new Question(8,"Chiến tranh Việt Nam kéo dài từ năm nào đến năm nào?", Arrays.asList("1954-1975", "1945-1954", "1975-1986", "1965-1973"), 0, 0));
        lichsu.add(new Question(9,"Ai là người lãnh đạo nước Việt Nam Dân chủ Cộng hòa (Nam Việt Nam) trong giai đoạn 1955-1963?", Arrays.asList("Ngô Đình Nhu", "Ngô Đình Diệm", "Ngô Đình Cẩn", "Ngô Đình Thục"), 1, 0));
        lichsu.add(new Question(10,"Đảng Cộng sản Việt Nam được thành lập vào ngày nào?", Arrays.asList("03/02/1930", "02/09/1945", "19/05/1951", "09/08/1945"), 0, 1));
        lichsu.add(new Question(11,"Ai là người lãnh đạo quân đội Việt Minh trong cuộc chiến tranh chống Pháp?", Arrays.asList("Võ Nguyên Giáp", "Hồ Chí Minh", "Trần Hưng Đạo", "Nguyễn Bình"), 0, 0));
        lichsu.add(new Question(12,"Sự kiện gì đã đánh dấu sự kiện kết thúc chiến tranh Việt Nam?", Arrays.asList("Ký kết Hiệp định Paris", "Sự kiện Biên giới 17", "Chiến thắng Điện Biên Phủ", "Ngày Quốc tế lao động"), 0, 0));
        lichsu.add(new  Question(13,"Ai là người sáng lập ra Đảng Cộng sản Việt Nam?", Arrays.asList("Hồ Chí Minh", "Trần Hưng Đạo", "Lê Lợi", "Ngô Quyền"), 0, 1));
        lichsu.add(new Question(14,"Năm nào Việt Nam chính thức giành độc lập?", Arrays.asList("1945", "1954", "1975", "1986"), 2, 1));
        lichsu.add(new Question(15,"Ai là người đầu tiên trở thành Tổng Bí thư của Đảng Cộng sản Việt Nam?", Arrays.asList("Lê Duẩn", "Hồ Chí Minh", "Nguyễn Văn Linh", "Trường Chinh"), 0, 0));
        lichsu.add(new Question(16,"Sự kiện nào được coi là mốc quan trọng đánh dấu sự chia ly giữa Bắc và Nam Việt Nam?", Arrays.asList("Biên giới 17", "Chiến tranh thế giới thứ hai kết thúc", "Cuộc di cư lớn 1954", "Chiến tranh Việt Nam kết thúc"), 2, 1));
        lichsu.add(new Question(17,"Dự án nào làm nền tảng cho sự phát triển kinh tế Việt Nam sau năm 1986?", Arrays.asList("Dự án Cần Thơ", "Dự án Hòa Bình", "Dự án Đổi mới", "Dự án Thăng Long"), 2, 1));
        lichsu.add(new Question(18,"Tổ hợp di tích nào ở Việt Nam được UNESCO công nhận là di sản thế giới?", Arrays.asList("Vịnh Hạ Long", "Hồ Gươm", "Thành cổ Huế", "Chùa Một Cột"), 0, 1));
        lichsu.add(new Question(19,"Chủ tịch nước Việt Nam đầu tiên là ai?", Arrays.asList("Hồ Chí Minh", "Trường Chinh", "Tôn Đức Thắng", "Nguyễn Phú Trọng"), 2, 1));
        lichsu.add(new Question(20,"Chiến tranh Việt Nam kéo dài từ năm nào đến năm nào?", Arrays.asList("1954-1975", "1945-1954", "1975-1986", "1965-1973"), 0, 0));
        lichsu.add(new Question(21,"Ai là người lãnh đạo nước Việt Nam Dân chủ Cộng hòa (Nam Việt Nam) trong giai đoạn 1955-1963?", Arrays.asList("Ngô Đình Nhu", "Ngô Đình Diệm", "Ngô Đình Cẩn", "Ngô Đình Thục"), 1, 0));
        lichsu.add(new Question(22,"Đảng Cộng sản Việt Nam được thành lập vào ngày nào?", Arrays.asList("03/02/1930", "02/09/1945", "19/05/1951", "09/08/1945"), 0, 1));
        lichsu.add(new Question(23,"Ai là người lãnh đạo quân đội Việt Minh trong cuộc chiến tranh chống Pháp?", Arrays.asList("Võ Nguyên Giáp", "Hồ Chí Minh", "Trần Hưng Đạo", "Nguyễn Bình"), 0, 0));
        lichsu.add(new Question(24,"Sự kiện gì đã đánh dấu sự kiện kết thúc chiến tranh Việt Nam?", Arrays.asList("Ký kết Hiệp định Paris", "Sự kiện Biên giới 17", "Chiến thắng Điện Biên Phủ", "Ngày Quốc tế lao động"), 0, 0));
    }

    private void ThemCauHoiDialy() {
        dialy = new ArrayList<>();
        dialy.add(new Question(13,"Thủ đô của nước Úc là gì?", Arrays.asList("Sydney", "Melbourne", "Canberra", "Perth"), 2, 0));
        dialy.add(new Question(14,"Sông nào là sông dài nhất thế giới?", Arrays.asList("Sông Amazon", "Sông Nile", "Sông Yangtze", "Sông Mississippi"), 1, 0));
        dialy.add(new Question(15,"Nước nào nằm ở cực Nam của châu Phi?", Arrays.asList("Nam Phi", "Kenya", "Nigeria", "Sudan"), 0, 0));
        dialy.add(new Question(16,"Thác nước nổi tiếng Niagara thuộc biên giới giữa hai quốc gia nào?", Arrays.asList("Hoa Kỳ và Canada", "Hoa Kỳ và Mexico", "Pháp và Đức", "Úc và New Zealand"), 0, 1));
        dialy.add(new Question(17,"Núi Everest, núi cao nhất thế giới, nằm ở lục địa nào?", Arrays.asList("Châu Á", "Châu Âu", "Châu Phi", "Châu Mỹ"), 0, 0));
        dialy.add(new Question(18,"Thành phố nào được gọi là 'Thủ đô của thế giới'?", Arrays.asList("New York", "Paris", "London", "Tokyo"), 0, 0));
        dialy.add(new Question(19,"Đỉnh núi nào là đỉnh cao nhất châu Phi?", Arrays.asList("Kilimanjaro", "Atlas", "Ruinsori", "Drakensberg"), 0, 0));
        dialy.add(new Question(20,"Đất nước nào nằm ở cực Bắc của châu Âu?", Arrays.asList("Nga", "Phần Lan", "Iceland", "Na Uy"), 2, 1));
        dialy.add(new Question(21,"Đảo nào là lớn nhất thế giới?", Arrays.asList("Đảo Madagascar", "Đảo Borneo", "Đảo Greenland", "Đảo Java"), 2, 0));
        dialy.add(new Question(22,"Thành phố Istanbul nằm ở giữa lục địa nào?", Arrays.asList("Châu Á và Châu Âu", "Châu Âu và Châu Phi", "Châu Á và Châu Phi", "Châu Mỹ và Châu Âu"), 0, 1));
        dialy.add(new Question(23,"Đảo Bali là một phần của quốc gia nào?", Arrays.asList("Indonesia", "Malaysia", "Philippines", "Thái Lan"), 0, 0));
        dialy.add(new Question(24,"Sông Thames nằm ở thành phố nào?", Arrays.asList("Paris", "Rome", "London", "Berlin"), 2, 1));
        dialy.add(new Question(25,"Nước nào nằm giữa Pháp và Tây Ban Nha?", Arrays.asList("Andorra", "Monaco", "San Marino", "Liechtenstein"), 0, 0));
        dialy.add(new Question(26,"Đại học Oxford nằm ở thành phố nào?", Arrays.asList("London", "Cambridge", "Oxford", "Manchester"), 2, 1));
        dialy.add(new Question(27,"Thành phố Tokyo nằm ở quốc gia nào?", Arrays.asList("Trung Quốc", "Hàn Quốc", "Nhật Bản", "Malaysia"), 2, 0));
        dialy.add(new Question(28,"Quốc gia nào có diện tích lớn nhất thế giới?", Arrays.asList("Nga", "Trung Quốc", "Mỹ", "Brazil"), 0, 1));
        dialy.add(new Question(29,"Đỉnh núi nào là đỉnh cao nhất châu Mỹ?", Arrays.asList("Núi McKinley", "Núi Aconcagua", "Núi Everest", "Núi Vinson Massif"), 1, 1));
        dialy.add(new Question(30,"Quốc gia nào nằm ở cực Nam của châu Mỹ?", Arrays.asList("Argentina", "Chile", "Uruguay", "Paraguay"), 0, 1));
        dialy.add(new Question(31,"Sông Nile chảy qua bao nhiêu quốc gia châu Phi?", Arrays.asList("2", "3", "4", "5"), 2, 1));
        dialy.add(new Question(32,"Kinh đô của nước Nga là gì?", Arrays.asList("Saint Petersburg", "Moscow", "Vladivostok", "Novosibirsk"), 1, 1));

    }

    private void ThemCauHoiKhoaHoc() {
        khoahoc = new ArrayList<>();
        khoahoc.add(new Question(33,"Ánh sáng mặt trời mất bao lâu để đến Trái Đất?", Arrays.asList("8 phút 20 giây", "12 phút", "30 phút", "1 giờ"), 0, 0));
        khoahoc.add(new Question(34,"Nguyên tố nào chiếm tỷ lệ lớn nhất trong cơ thể con người?", Arrays.asList("Oxygen", "Hydrogen", "Carbon", "Nitrogen"), 2, 0));
        khoahoc.add(new Question(35,"Quang hợp là quá trình gì?", Arrays.asList("Quá trình hô hấp", "Quá trình tỏa nhiệt", "Quá trình chuyển hóa năng lượng ánh sáng thành năng lượng hóa học", "Quá trình phát sáng"), 2, 1));
        khoahoc.add(new Question(36,"Nguyên tố hóa học có ký hiệu là 'Fe' là gì?", Arrays.asList("Fluorine", "Iron", "Phosphorus", "Helium"), 1, 0));
        khoahoc.add(new Question(37,"Cảm biến nhiệt độ là loại cảm biến nào?", Arrays.asList("Cảm biến ánh sáng", "Cảm biến âm thanh", "Cảm biến nhiệt độ", "Cảm biến chuyển động"), 2, 0));
        khoahoc.add(new Question(38,"Loại tế bào nào chịu trách nhiệm sản xuất năng lượng trong tế bào?", Arrays.asList("Tế bào cơ", "Tế bào thần kinh", "Tế bào gốc", "Mitochondria"), 3, 1));
        khoahoc.add(new Question(39,"Đơn vị nào được sử dụng để đo cường độ âm thanh?", Arrays.asList("Watt", "Decibel", "Hertz", "Newton"), 1, 0));
        khoahoc.add(new Question(40,"Nguyên tử gồm những phần tử nào?", Arrays.asList("Protons, Neutrons, Electrons", "Carbon, Oxygen, Hydrogen", "Gold, Silver, Copper", "Nitrogen, Oxygen, Argon"), 0, 1));
        khoahoc.add(new Question(41,"Nguyên tắc hoạt động của tia X là gì?", Arrays.asList("Giao thoa", "Phản xạ", "Phát xạ", "Chuyển động thẳng"), 2, 0));
        khoahoc.add(new Question(42,"Quá trình phản ứng hạch năng là gì?", Arrays.asList("Quá trình giữ năng lượng", "Quá trình giải phóng năng lượng", "Quá trình chuyển đổi năng lượng từ nhiệt độ", "Quá trình giữ lại nhiệt độ"), 1, 1));
        khoahoc.add(new Question(43,"Loại năng lượng nào là nguồn năng lượng tái tạo?", Arrays.asList("Than đá", "Dầu mỏ", "Năng lượng hạt nhân", "Năng lượng mặt trời"), 3, 0));
        khoahoc.add(new Question(44,"Loại vitamin nào là cần thiết cho sự tạo ra collagen?", Arrays.asList("Vitamin A", "Vitamin C", "Vitamin D", "Vitamin K"), 1, 1));
        khoahoc.add(new Question(45,"Loại tia nào từ Mặt Trời gây ra tình trạng cháy nám da?", Arrays.asList("Tia UVA", "Tia UVB", "Tia UVC", "Tia X"), 1, 0));
        khoahoc.add(new Question(46,"Nguyên tắc hoạt động của tia hồng ngoại là gì?", Arrays.asList("Tia hồng ngoại được hấp thụ bởi ozon", "Tia hồng ngoại được hấp thụ bởi nước", "Tia hồng ngoại được hấp thụ bởi carbon dioxide", "Tia hồng ngoại được hấp thụ bởi nitơ"), 1, 1));
        khoahoc.add(new Question(47,"Loại vi khuẩn nào sản xuất năng lượng từ ánh sáng mặt trời?", Arrays.asList("Vi khuẩn nitrat", "Vi khuẩn nitrit", "Vi khuẩn nitrosomonas", "Vi khuẩn nitrifying"), 0, 1));
        khoahoc.add(new Question(48,"Thành phần chính của khí quyển là gì?", Arrays.asList("Oxygen", "Carbon dioxide", "Nitrogen", "Methane"), 2, 0));
        khoahoc.add(new Question(49,"Tia cực tím từ Mặt Trời có thể gây tổn thương cho lớp nào của tạp chất ô nhiễm không khí?", Arrays.asList("Tạp chất hữu cơ", "Tạp chất vi sinh", "Tạp chất không hữu cơ", "Tạp chất hữu cơ và không hữu cơ"), 0, 1));
        khoahoc.add(new Question(50,"Nguyên tố nào chiếm tỷ lệ lớn nhất trong không khí?", Arrays.asList("Oxygen", "Nitrogen", "Carbon dioxide", "Argon"), 1, 0));
        khoahoc.add(new Question(51,"Tế bào dựa vào loại năng lượng nào để thực hiện các hoạt động của mình?", Arrays.asList("Năng lượng từ nước", "Năng lượng từ nhiệt độ", "Năng lượng từ glucose", "Năng lượng từ ánh sáng mặt trời"), 2, 1));

    }

    private void ThemCauHoiNgheThuat() {
        nghethuat = new ArrayList<>();
        nghethuat.add(new Question(52,"Ai là họa sĩ nổi tiếng của bức tranh 'Mona Lisa'?", Arrays.asList("Vincent van Gogh", "Pablo Picasso", "Leonardo da Vinci", "Claude Monet"), 2, 0));
        nghethuat.add(new Question(53,"Bức tượng nổi tiếng 'Chúa Kitô Phục Sinh' nằm ở thành phố nào?", Arrays.asList("Rome, Italy", "Paris, France", "Rio de Janeiro, Brazil", "New York, USA"), 2, 0));
        nghethuat.add(new Question(3,"Nghệ sĩ nổi tiếng Georgia O'Keeffe chủ yếu tập trung vào loại nghệ thuật nào?", Arrays.asList("Hội họa trừu tượng", "Sculpture", "Nhiếp ảnh", "Hội họa hiện thực"), 0, 0));
        nghethuat.add(new Question(4,"Bức tranh nào của Edvard Munch nổi tiếng với biểu tượng 'The Scream'?", Arrays.asList("Starry Night", "The Persistence of Memory", "Guernica", "The Scream"), 3, 0));
        nghethuat.add(new Question(5,"Trường phái nghệ thuật nào nổi tiếng với việc sử dụng chủ đề thiên nhiên và đời sống hàng ngày?", Arrays.asList("Impressionism", "Cubism", "Abstract Expressionism", "Realism"), 0, 1));
        nghethuat.add(new Question(6,"Bức tượng nào nổi tiếng của Michelangelo được tạo ra từ một khối đá đơn?", Arrays.asList("The Thinker", "David", "The Venus de Milo", "The Pieta"), 1, 0));
        nghethuat.add(new Question(7,"Bức tranh 'The Starry Night' là tác phẩm của nghệ sĩ nổi tiếng nào?", Arrays.asList("Vincent van Gogh", "Pablo Picasso", "Leonardo da Vinci", "Claude Monet"), 0, 0));
        nghethuat.add(new Question(8,"Nghệ sĩ Salvador Dalí nổi tiếng với phong cách nghệ thuật nào?", Arrays.asList("Cubism", "Surrealism", "Abstract Expressionism", "Pop Art"), 1, 0));
        nghethuat.add(new Question(9,"Nghệ sĩ nào được biết đến là 'cha đẻ' của nghệ thuật phóng tác?", Arrays.asList("Claude Monet", "Pierre-Auguste Renoir", "Édouard Manet", "Paul Cézanne"), 2, 1));
        nghethuat.add(new Question(10,"Bức tranh 'Guernica' nổi tiếng là tác phẩm của nghệ sĩ nào?", Arrays.asList("Salvador Dalí", "Pablo Picasso", "Vincent van Gogh", "Claude Monet"), 1, 0));
        nghethuat.add(new Question(11,"Bức tượng nổi tiếng 'The Thinker' thuộc sở hữu của nghệ sĩ nào?", Arrays.asList("Auguste Rodin", "Michelangelo", "Leonardo da Vinci", "Donatello"), 0, 0));
        nghethuat.add(new Question(12,"Nghệ sĩ Frida Kahlo nổi tiếng với loại nghệ thuật nào?", Arrays.asList("Impressionism", "Surrealism", "Abstract Expressionism", "Pop Art"), 1, 0));
        nghethuat.add(new Question(13,"Trường phái nghệ thuật nào tập trung vào việc sử dụng ánh sáng và màu sắc để tạo ra cảm giác chân thực nhất?", Arrays.asList("Impressionism", "Cubism", "Realism", "Surrealism"), 2, 1));
        nghethuat.add(new Question(14,"Tác phẩm 'The Last Supper' được sáng tác bởi nghệ sĩ nổi tiếng nào?", Arrays.asList("Vincent van Gogh", "Pablo Picasso", "Leonardo da Vinci", "Claude Monet"), 2, 0));
        nghethuat.add(new Question(15,"Nghệ sĩ Andy Warhol nổi tiếng với loại nghệ thuật nào?", Arrays.asList("Abstract Expressionism", "Surrealism", "Pop Art", "Cubism"), 2, 1));
        nghethuat.add(new Question(16,"Bức tranh 'Water Lilies' là tác phẩm của nghệ sĩ nổi tiếng nào?", Arrays.asList("Claude Monet", "Edgar Degas", "Pierre-Auguste Renoir", "Édouard Manet"), 0, 1));
        nghethuat.add(new Question(17,"Nghệ sĩ nào nổi tiếng với sự kết hợp của hội họa và điêu khắc trong tác phẩm của mình?", Arrays.asList("Henri Matisse", "Jackson Pollock", "Pablo Picasso", "Constantin Brâncuși"), 3, 1));
        nghethuat.add(new Question(18,"Bức tượng nào nổi tiếng đặt ở Liberty Island, New York?", Arrays.asList("Statue of Zeus at Olympia", "The Thinker", "The Statue of Liberty", "David"), 2, 0));
        nghethuat.add(new Question(19,"Nghệ sĩ nào nổi tiếng với việc sáng tạo ra phong cách 'dot painting'?", Arrays.asList("Pablo Picasso", "Vincent van Gogh", "Jackson Pollock", "Aboriginal Artists"), 3, 1));

    }
    private void ThemCauHoiToanHoc() {
        toanhoc = new ArrayList<>();
        toanhoc.add(new Question(1, "Tính giá trị của biểu thức: 3 + 4 × 2.", Arrays.asList("11", "14", "7", "18"), 1, 0));
        toanhoc.add(new Question(2, "Tính giá trị của biểu thức: 5 - (2 + 3 × 4).", Arrays.asList("1", "7", "-7", "-21"), 2, 1));
        toanhoc.add(new Question(3, "Hãy tính tổng các số từ 1 đến 10 là bao nhiêu?", Arrays.asList("45", "55", "50", "60"), 1, 0));
        toanhoc.add(new Question(4, "Cho phương trình 2x + 3 = 7. Giá trị của x là?", Arrays.asList("2", "3", "4", "5"), 1, 1));
        toanhoc.add(new Question(5, "Giải phương trình 3x - 2 = 10.", Arrays.asList("x = 4", "x = 6", "x = 8", "x = 10"), 1, 0));
        toanhoc.add(new Question(6, "Tính diện tích hình chữ nhật có chiều dài 6 cm và chiều rộng 4 cm.", Arrays.asList("24 cm^2", "18 cm^2", "12 cm^2", "10 cm^2"), 1, 1));
        toanhoc.add(new Question(7, "Cho tam giác có cạnh a = 4 cm, cạnh b = 5 cm, cạnh c = 6 cm. Tam giác đó là tam giác gì?", Arrays.asList("Vuông", "Đều", "Cân", "Tù"), 4, 0));
        toanhoc.add(new Question(8, "Tính chu vi hình tròn có bán kính 7 cm.", Arrays.asList("14π cm", "21π cm", "28π cm", "49π cm"), 2, 1));
        toanhoc.add(new Question(9, "Tính diện tích hình tròn có bán kính 10 cm.", Arrays.asList("100π cm^2", "200π cm^2", "300π cm^2", "400π cm^2"), 1, 0));
        toanhoc.add(new Question(10, "Tính giá trị của biểu thức: log2(8).", Arrays.asList("2", "3", "4", "8"), 2, 1));
        toanhoc.add(new Question(11, "Cho phương trình x^2 - 4x + 3 = 0. Giá trị của x là?", Arrays.asList("1 và 3", "2 và 4", "3 và 5", "4 và 6"), 1, 0));
        toanhoc.add(new Question(12, "Tìm giá trị lớn nhất của hàm số y = x^2 - 4x + 5.", Arrays.asList("1", "2", "3", "4"), 4, 1));
        toanhoc.add(new Question(13, "Tìm giá trị nhỏ nhất của hàm số y = 2x^2 + 4x - 3.", Arrays.asList("-2", "-1", "0", "1"), 3, 0));
        toanhoc.add(new Question(14, "Tính giá trị của biểu thức: sinh(0).", Arrays.asList("0", "1", "e", "∞"), 1, 1));
        toanhoc.add(new Question(15, "Tính giá trị của biểu thức: cos(π/2).", Arrays.asList("0", "1", "-1", "∞"), 2, 0));
        toanhoc.add(new Question(16, "Tính giá trị của biểu thức: tan(0).", Arrays.asList("0", "1", "-1", "∞"), 1, 1));
    }
    private void ThemCauHoiTiengAnh() {
        tienganh = new ArrayList<>();

        tienganh.add(new Question(21, "What is the capital city of Australia?", Arrays.asList("Sydney", "Melbourne", "Canberra", "Perth"), 3, 1));
        tienganh.add(new Question(22, "Who wrote the play 'Romeo and Juliet'?", Arrays.asList("William Shakespeare", "Charles Dickens", "Mark Twain", "Jane Austen"), 1, 0));
        tienganh.add(new Question(23, "What is the largest organ in the human body?", Arrays.asList("Heart", "Liver", "Lung", "Skin"), 4, 1));
        tienganh.add(new Question(24, "Which planet is known as the 'Red Planet'?", Arrays.asList("Venus", "Jupiter", "Mars", "Saturn"), 3, 1));
        tienganh.add(new Question(25, "Who painted the Mona Lisa?", Arrays.asList("Vincent van Gogh", "Leonardo da Vinci", "Pablo Picasso", "Michelangelo"), 2, 0));
        tienganh.add(new Question(26, "What is the chemical symbol for gold?", Arrays.asList("Go", "Au", "Ag", "Gd"), 2, 1));
        tienganh.add(new Question(27, "Which country is known for its famous tulip fields?", Arrays.asList("Netherlands", "France", "Italy", "England"), 1, 0));
        tienganh.add(new Question(28, "What is the national language of Japan?", Arrays.asList("Korean", "Chinese", "Japanese", "Thai"), 3, 1));
        tienganh.add(new Question(29, "Who is the author of the Harry Potter book series?", Arrays.asList("J.K. Rowling", "Stephen King", "George R.R. Martin", "Dan Brown"), 1, 0));
        tienganh.add(new Question(30, "What is the tallest mountain in the world?", Arrays.asList("Mount Everest", "K2", "Kangchenjunga", "Makalu"), 1, 0));
        tienganh.add(new Question(31, "What is the capital city of France?", Arrays.asList("Paris", "London", "Rome", "Berlin"), 1, 0));
        tienganh.add(new Question(32, "Who is the author of the novel 'Pride and Prejudice'?", Arrays.asList("Jane Austen", "Emily Bronte", "Charlotte Bronte", "Louisa May Alcott"), 1, 0));
        tienganh.add(new Question(33, "What is the chemical symbol for oxygen?", Arrays.asList("O", "H", "C", "N"), 1, 1));
        tienganh.add(new Question(34, "Which country is known for its famous pyramids?", Arrays.asList("Greece", "Egypt", "Mexico", "China"), 2, 1));
        tienganh.add(new Question(35, "Who is the lead singer of the band 'Queen'?", Arrays.asList("Freddie Mercury", "Bono", "Mick Jagger", "Elton John"), 1, 0));
        tienganh.add(new Question(36, "What is the largest ocean in the world?", Arrays.asList("Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean"), 4, 0));
        tienganh.add(new Question(37, "Who painted the 'Starry Night'?", Arrays.asList("Claude Monet", "Salvador Dali", "Edgar Degas", "Vincent van Gogh"), 4, 1));
        tienganh.add(new Question(38, "Which country is the birthplace of the Olympics?", Arrays.asList("Greece", "Italy", "Spain", "Egypt"), 1, 1));
        tienganh.add(new Question(39, "What is the national animal of Australia?", Arrays.asList("Kangaroo", "Koala", "Platypus", "Emu"), 1, 0));
        tienganh.add(new Question(40, "Who is the current president of the United States?", Arrays.asList("Barack Obama", "Joe Biden", "Donald Trump", "George W. Bush"), 2, 0));
    }
    private void ThemCauHoiVanHoc() {
        vanhoc = new ArrayList<>();
        vanhoc.add(new Question(2, "Tác phẩm \"Chí Phèo\" của Nam Cao thuộc thể loại nào?", Arrays.asList("Tiểu thuyết", "Truyện ngắn", "Kịch", "Thơ"), 0, 1));
        vanhoc.add(new Question(3, "Ai là tác giả của bộ truyện \"Bí mật của tôi\"?", Arrays.asList("Nguyễn Nhật Ánh", "Trung Hiếu", "Ngô Tất Tố", "Nguyễn Du"), 0, 0));
        vanhoc.add(new Question(4, "Nhân vật chính trong tác phẩm \"Lão Hạc\" của Nam Cao là ai?", Arrays.asList("Lão Hạc", "Lão Khoa", "Lão Trọc", "Lão Hồ"), 2, 1));
        vanhoc.add(new Question(5, "Tác phẩm \"Đất lửa\" của Lê Lựu kể về đề tài gì?", Arrays.asList("Cuộc sống nông thôn", "Chiến tranh thế giới thứ hai", "Tình yêu tuổi học trò", "Phong cách sống hiện đại"), 1, 0));
        vanhoc.add(new Question(6, "Ai là tác giả của tác phẩm \"Số đỏ\"?", Arrays.asList("Nguyễn Du", "Nam Cao", "Ngô Tất Tố", "Vũ Trọng Phụng"), 3, 1));
        vanhoc.add(new Question(7, "Tác phẩm \"Nhà giả kim\" của Paulo Coelho thuộc thể loại nào?", Arrays.asList("Tiểu thuyết hiện thực", "Tiểu thuyết kỳ ảo", "Khoa học viễn tưởng", "Tiểu thuyết tâm lý"), 1, 1));
        vanhoc.add(new Question(8, "Tác phẩm \"Mắt biếc\" của nhà văn Nguyễn Nhật Ánh mô tả cuộc sống ở đâu?", Arrays.asList("Hà Nội", "Huế", "Quảng Nam", "Sài Gòn"), 2, 1));
        vanhoc.add(new Question(9, "Tác phẩm \"Tốc độ của niềm tin\" của Đỗ Trọng Tuấn nói về chủ đề gì?", Arrays.asList("Chính trị", "Tình yêu", "Khoa học", "Tôn giáo"), 0, 0));
        vanhoc.add(new Question(10, "Tác phẩm \"Truyện Kiều\" của Nguyễn Du là loại hình nào?", Arrays.asList("Truyện kiếm hiệp", "Thơ trữ tình", "Tragedy", "Truyện hài hước"), 1, 1));
        vanhoc.add(new Question(11, "Ai là tác giả của tác phẩm \"Mối tình đầu\"?", Arrays.asList("Nguyễn Nhật Ánh", "Nguyễn Hồng", "Nguyễn Du", "Ngô ất Tố"), 1, 0));
        vanhoc.add(new Question(12, "Tác phẩm \"Chiếc lược ngà\" của nhà văn Nguyễn Nhật Ánh là câu chuyện về đề tài gì?", Arrays.asList("Tình yêu", "Cuộc sống xã hội", "Chính trị", "Học đường"), 0, 1));
        vanhoc.add(new Question(13, "Nhân vật chính trong tác phẩm \"Tôi thấy hoa vàng trên cỏ xanh\" là ai?", Arrays.asList("An", "Hà", "Hòa", "Thắng"), 3, 0));
        vanhoc.add(new Question(14, "Tác phẩm \"Tắt đèn\" của Nam Cao mô tả cuộc sống nông thôn ở đâu?", Arrays.asList("Hương Sơn", "Mê Linh", "Nghệ An", "Làng Sen"), 2, 0));
        vanhoc.add(new Question(15, "Trong tác phẩm \"Cô gái đến từ hôm qua\", nhân vật nữ chính tên là gì?", Arrays.asList("Lan", "Mai", "Hằng", "Thu"), 1, 1));
        vanhoc.add(new Question(16, "Tác phẩm \"Chạy trốn\" của Lê Minh Khuê thuộc thể loại nào?", Arrays.asList("Tiểu thuyết hiện thực", "Kịch", "Tiểu thuyết tình cảm", "Thơ"), 0, 1));
        vanhoc.add(new Question(17, "Nhân vật chính trong tác phẩm \"Dế mèn phiêu lưu ký\" của Tô Hoài là ai?", Arrays.asList("Dế mèn", "Cụ Mèo", "Châu chấu", "Gà mái"), 0, 1));
        vanhoc.add(new Question(18, "Tác phẩm \"Hồn Trương Ba, da hàng thịt\" của Vũ Trọng Phụng nói về đề tài gì?", Arrays.asList("Tình yêu", "Nghệ thuật", "Chính trị", "Xã hội"), 2, 0));
        vanhoc.add(new Question(19, "Tác phẩm \"Mối tình đầu\" của Nguyễn Nhật Ánh xoay quanh mối tình giữa nhân vật nào?", Arrays.asList("Nguyễn Hồng", "Thắng", "Thu", "Ngọc"), 1, 1));
    }
    private void ThemCauHoiMoiTruong() {
        moitruong = new ArrayList<>();
        moitruong.add(new Question(1, "Cây nào sau đây thường được gọi là 'lá phổi của trái đất'?", Arrays.asList("Bách Dinh", "Dương xỉ", "Rừng Amazon", "Cỏ tranh"), 2, 1));
        moitruong.add(new Question(2, "Môi trường lành mạnh có thể ảnh hưởng tích cực đến sức khỏe của con người. Loại không khí nào sau đây được coi là tốt nhất cho sức khỏe?", Arrays.asList("Không khí có nhiều khí oxy", "Không khí có nhiều carbon dioxide", "Không khí có chất ô nhiễm", "Không khí có nhiều chất béo"), 0, 0));
        moitruong.add(new Question(3, "Hiệu ứng nhà kính là gì?", Arrays.asList("Quá trình nhiệt độ trái đất tăng lên", "Quá trình lạnh hóa trái đất", "Quá trình giảm nhiệt độ trái đất", "Quá trình tăng nhiệt độ trái đất"), 0, 1));
        moitruong.add(new Question(4, "Phân loại nào sau đây đặc điểm chính là sự chết đói của cây cỏ và rừng cây?", Arrays.asList("Đất", "Khí hậu", "Ô nhiễm không khí", "Nước"), 3, 0));
        moitruong.add(new Question(5, "Thiên nhiên bảo vệ chống lại hiện tượng nào sau đây?", Arrays.asList("Bão", "Cháy rừng", "Lũ lụt", "Tất cả đều đúng"), 3, 1));
        moitruong.add(new Question(6, "Điều gì gây ra hiện tượng gió?", Arrays.asList("Sự chênh lệch nhiệt độ giữa hai khu vực", "Chuyển động của mặt trời", "Biến đổi của sự lưu thông hải dương", "Tất cả đều đúng"), 0, 0));
        moitruong.add(new Question(7, "Hiện tượng sình lầy xanh có thể xảy ra do điều gì?", Arrays.asList("Sự gia tăng nhiệt độ", "Sự giảm nhiệt độ", "Sự gia tăng ô nhiễm môi trường", "Sự giảm ô nhiễm môi trường"), 2, 1));
        moitruong.add(new Question(8, "Loại rác nào sau đây gây ô nhiễm nặng nề nhất cho môi trường nước?", Arrays.asList("Rác hữu cơ", "Rác nhựa", "Rác kim loại", "Rác hóa học"), 1, 0));
        moitruong.add(new Question(9, "Loại rừng nào chủ yếu được trồng để thu hoạch gỗ?", Arrays.asList("Rừng nguyên sinh", "Rừng ngập mặn", "Rừng nguyên sinh", "Rừng trồng"), 3, 1));
        moitruong.add(new Question(10, "Hiện tượng nào sau đây không phải là hậu quả của sự biến đổi khí hậu?", Arrays.asList("Tăng cường hiện tượng cháy rừng", "Tăng cường mức độ biển lên", "Sự mất mát đa dạng sinh học", "Tăng cường độ cường độ bão"), 3, 0));
        moitruong.add(new Question(11, "Nguyên nhân chính gây ra hiệu ứng nhà kính là do sự tăng của loại khí nào?", Arrays.asList("Oxy", "Nitơ", "CO2", "Metan"), 2, 1));
        moitruong.add(new Question(12, "Phân loại nào sau đây không phải là một loại môi trường?", Arrays.asList("Môi trường tự nhiên", "Môi trường xã hội", "Môi trường nhân tạo", "Môi trường hóa học"), 3, 0));
        moitruong.add(new Question(13, "Loại năng lượng nào sau đây được coi là năng lượng sạch?", Arrays.asList("Năng lượng hạt nhân", "Năng lượng than", "Năng lượng mặt trời", "Năng lượng dầu mỏ"), 2, 1));
        moitruong.add(new Question(14, "Hiện tượng mất rừng có thể gây ra do điều gì?", Arrays.asList("Cháy rừng", "Biến đổi khí hậu", "Phát triển kinh tế", "Chăn nuôi quá mức"), 3, 0));
        moitruong.add(new Question(15, "Đâu không phải là một biện pháp bảo vệ môi trường?", Arrays.asList("Tái chế", "Tiết kiệm năng lượng", "Xả thải ô nhiễm vào sông", "Bảo vệ rừng"), 2, 1));
        moitruong.add(new Question(16, "Loại năng lượng nào đang là nguồn năng lượng phổ biến nhất trên thế giới?", Arrays.asList("Năng lượng hạt nhân", "Năng lượng than", "Năng lượng mặt trời", "Năng lượng gió"), 2, 0));
        moitruong.add(new Question(17, "Sự suy giảm đa dạng sinh học có thể dẫn đến điều gì?", Arrays.asList("Sự gia tăng đa dạng sinh học", "Mất cân bằng sinh thái", "Bảo vệ môi trường", "Tất cả đều đúng"), 1, 1));
        moitruong.add(new Question(18, "Nguyên tắc '3R' trong quản lý rác thải có ý nghĩa gì?", Arrays.asList("Reduce, Reuse, Replant", "Recycle, Refuse, Reheat", "Reduce, Recycle, Reuse", "Reject, Recycle, Reuse"), 2, 0));
        moitruong.add(new Question(19, "Đâu không phải là một nguyên nhân gây ra biến đổi khí hậu?", Arrays.asList("Khí thải từ phương tiện giao thông", "Cháy rừng", "Làm mất rừng", "Tăng cường chăn nuôi"), 3, 1));
        moitruong.add(new Question(20, "Hiện tượng nào dưới đây là một hậu quả của ô nhiễm không khí?", Arrays.asList("Hiện tượng nóng chảy băng tuyết", "Tăng nhiệt độ trái đất", "Hiện tượng cháy rừng", "Hiện tượng nước biển mặn đi"), 1, 0));
        moitruong.add(new Question(21, "Đâu không phải là một nguyên nhân gây hiện tượng biến đổi đất đai?", Arrays.asList("Sử dụng phân bón hóa học", "Rung mình đất đai", "Ô nhiễm đất", "Chặt phá rừng"), 1, 1));
        moitruong.add(new Question(22, "Hiện tượng nào sau đây không phải là một hậu quả của ô nhiễm nước?", Arrays.asList("Tăng nhiệt độ trái đất", "Mất nước ngầm", "Giảm đa dạng sinh học trong sông", "Tăng độ pH của nước"), 1, 0));
        moitruong.add(new Question(23, "Đâu là nguồn gốc chính của ô nhiễm tiếng ồn trong thành phố?", Arrays.asList("Phương tiện giao thông", "Công nghiệp", "Đám đông", "Nông nghiệp"), 0, 1));
        moitruong.add(new Question(24, "Loại năng lượng nào đang gây ra vấn đề liên quan đến lượng rác thải nguy hại?", Arrays.asList("Năng lượng hạt nhân", "Năng lượng than", "Năng lượng hủy sinh", "Năng lượng mặt trời"), 2, 0));
        moitruong.add(new Question(25, "Biện pháp nào sau đây giúp giảm lượng rác thải nhựa?", Arrays.asList("Sử dụng túi nhựa tái chế", "Sử dụng nhiều đồ đựng nhựa", "Hủy sinh năng lượng", "Biến đổi gen"), 0, 1));
        moitruong.add(new Question(26, "Hiện tượng nào dưới đây là một hậu quả của biến đổi khí hậu?", Arrays.asList("Giảm biến động thời tiết", "Tăng số lượng bão và cơn lốc", "Giảm năng suất nông nghiệp", "Tất cả đều đúng"), 3, 0));
        moitruong.add(new Question(27, "Loại hình năng lượng nào đang trở thành xu hướng để giảm phát thải khí nhà kính?", Arrays.asList("Năng lượng hạt nhân", "Năng lượng than", "Năng lượng gió", "Năng lượng dầu mỏ"), 2, 1));
        moitruong.add(new Question(28, "Cơ chế nào sau đây làm giảm lượng CO2 trong không khí?", Arrays.asList("Quang hợp", "Quảng hợp", "Quang hợp", "Quang hợp"), 0, 1));
        moitruong.add(new Question(29, "Loại rác thải nào gây hại nhiều nhất cho môi trường?", Arrays.asList("Rác thải hữu cơ", "Rác thải nhựa", "Rác thải giấy", "Rác thải thủy tinh"), 1, 1));
        moitruong.add(new Question(30, "Đâu là biện pháp hiệu quả để bảo vệ đa dạng sinh học?", Arrays.asList("Phá rừng", "Phát triển đô thị", "Bảo tồn khu vực quan trọng về đa dạng sinh học", "Ô nhiễm môi trường"), 2, 0));

    }
    private void ThemCauHoiTheThao() {
        thethao = new ArrayList<>();
        thethao.add(new Question(1, "Cầu thủ nào đã giành Quả bóng vàng FIFA năm 2019?", Arrays.asList("Lionel Messi", "Cristiano Ronaldo", "Virgil van Dijk", "Luka Modric"), 0, 0));
        thethao.add(new Question(2, "Môn thể thao nào có nguồn gốc từ Scotland?", Arrays.asList("Bóng đá", "Cầu lông", "Bóng rổ", "Golf"), 3, 1));
        thethao.add(new Question(3, "Ai là vận động viên vô địch quần vợt nam giành nhiều Grand Slam nhất trong lịch sử?", Arrays.asList("Roger Federer", "Rafael Nadal", "Novak Djokovic", "Pete Sampras"), 2, 0));
        thethao.add(new Question(4, "Môn thể thao nào có quả bóng màu đỏ?", Arrays.asList("Bóng chày", "Bóng rổ", "Bóng đá", "Bóng bàn"), 0, 1));
        thethao.add(new Question(5, "Vận động viên Usain Bolt nổi tiếng trong môn thể thao nào?", Arrays.asList("Bơi lội", "Bóng đá", "Đua xe đạp", "Đua chạy"), 3, 0));
        thethao.add(new Question(6, "Đội bóng nào đã giành chức vô địch World Cup năm 2018?", Arrays.asList("Pháp", "Bỉ", "Croatia", "Anh"), 0, 1));
        thethao.add(new Question(7, "Môn thể thao nào có sân đấu có hình dạng là đường tròn?", Arrays.asList("Bóng rổ", "Bóng chày", "Quần vợt", "Bóng đá"), 2, 0));
        thethao.add(new Question(8, "Vận động viên nào đã giành nhiều huy chương Olympic nhất trong lịch sử?", Arrays.asList("Michael Phelps", "Usain Bolt", "Simone Biles", "Serena Williams"), 0, 1));
        thethao.add(new Question(9, "Môn thể thao nào có quả bóng màu vàng?", Arrays.asList("Bóng rổ", "Bóng chày", "Bóng bàn", "Bóng đá"), 3, 1));
        thethao.add(new Question(10, "Đội bóng nào đã giành chức vô địch World Cup năm 2014?", Arrays.asList("Đức", "Argentina", "Tây Ban Nha", "Brazil"), 0, 1));
        thethao.add(new Question(11, "Môn thể thao nào được chơi trên một sân có 18 lỗ?", Arrays.asList("Bóng đá", "Golf", "Bóng chày", "Bóng rổ"), 1, 1));
        thethao.add(new Question(12, "Ai là cầu thủ ghi nhiều bàn thắng nhất trong lịch sử bóng đá?", Arrays.asList("Pele", "Cristiano Ronaldo", "Lionel Messi", "Romario"), 2, 0));
        thethao.add(new Question(14, "Đội bóng nào đã giành chức vô địch Euro 2020?", Arrays.asList("Italy", "England", "France", "Germany"), 0, 0));
        thethao.add(new Question(15, "Môn thể thao nào có quả bóng màu vàng cam?", Arrays.asList("Bóng rổ", "Bóng chày", "Bóng bàn", "Bóng đá"), 1, 1));
        thethao.add(new Question(16, "Vận động viên nào đã giành nhiều chức vô địch Wimbledon nhất trong lịch sử?", Arrays.asList("Roger Federer", "Rafael Nadal", "Novak Djokovic", "Pete Sampras"), 0, 0));
        thethao.add(new Question(17, "Môn thể thao nào được chơi trên một sân có 22 người thi đấu?", Arrays.asList("Bóng đá", "Golf", "Bóng chày", "Bóng rổ"), 0, 1));
        thethao.add(new Question(18, "Ai là cầu thủ ghi nhiều bàn thắng nhất trong một mùa giải Ngoại hạng Anh?", Arrays.asList("Alan Shearer", "Thierry Henry", "Cristiano Ronaldo", "Mohamed Salah"), 3, 0));
        thethao.add(new Question(19, "Môn thể thao nào có trái bóng màu xanh dương?", Arrays.asList("Bóng rổ", "Bóng chày", "Bóng bàn", "Bóng đá"), 1, 1));
        thethao.add(new Question(20, "Đội bóng nào đã giành chức vô địch World Cup năm 2006?", Arrays.asList("Italia", "Brazil", "Argentina", "Đức"), 0, 0));
        thethao.add(new Question(21, "Môn thể thao nào được chơi trên một sân có biên giới?", Arrays.asList("Bóng đá", "Golf", "Bóng chày", "Bóng rổ"), 0, 1));
        thethao.add(new Question(22, "Vận động viên nào đã giành nhiều huy chương Olympic vàng nhất trong lịch sử?", Arrays.asList("Michael Phelps", "Usain Bolt", "Simone Biles", "Serena Williams"), 0, 0));
        thethao.add(new Question(23, "Môn thể thao nào có quả bóng màu đen và trắng?", Arrays.asList("Bóng rổ", "Bóng chày", "Bóng bàn", "Bóng đá"), 2, 0));
        thethao.add(new Question(24, "Đội bóng nào đã giành chức vô địch Euro 2016?", Arrays.asList("Portugal", "France", "Germany", "Spain"), 0, 1));
        thethao.add(new Question(25, "Môn thể thao nào được chơi trên một sân có 9 vòng?", Arrays.asList("Bóng đá", "Golf", "Bóng chày", "Bóng rổ"), 2, 0));
        thethao.add(new Question(26, "Cầu thủ nào đã giành Quả bóng vàng FIFA năm 2018?", Arrays.asList("Luka Modric", "Cristiano Ronaldo", "Antoine Griezmann", "Kylian Mbappé"), 0, 1));
    }
    private void ThemCauHoiAll() {
        all = new ArrayList<>();
        for(int i =0; i<lichsu.size();i++){
            all.add(lichsu.get(i));
        }  for(int i =0; i<dialy.size();i++){
            all.add(dialy.get(i));
        }for(int i =0; i<khoahoc.size();i++){
            all.add(khoahoc.get(i));
        } for(int i =0; i<nghethuat.size();i++){
            all.add(nghethuat.get(i));
        }
        for(int i =0; i<thethao.size();i++){
            all.add(thethao.get(i));
        }
        for(int i =0; i<toanhoc.size();i++){
            all.add(toanhoc.get(i));
        }
        for(int i =0; i<vanhoc.size();i++){
            all.add(vanhoc.get(i));
        }
        for(int i =0; i<tienganh.size();i++){
            all.add(tienganh.get(i));
        }
        for(int i =0; i<moitruong.size();i++){
            all.add(moitruong.get(i));
        }

    }


    public List<Question> getLichsu() {
        return lichsu;
    }


    public List<Question> getDialy() {
        return dialy;
    }

    public List<Question> getKhoahoc() {
        return khoahoc;
    }

    public List<Question> getNghethuat() {

        return nghethuat;
    }
    public List<Question> getMoitruong() {
        return moitruong;
    }
    public List<Question> getVanhoc() {
        return vanhoc;
    }
    public List<Question> getToanhoc() {
        return toanhoc;
    }
    public List<Question> getTienganh() {return tienganh;}
    public List<Question> getThethao() {
        return thethao;
    }
    public  List<Question> getAll(){return all;}
}
