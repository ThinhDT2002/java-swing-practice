CREATE DATABASE Smartphone_Shop
GO
USE Smartphone_Shop
GO
--Create table NhaCungCap
CREATE TABLE NhaCungCap(
	MaNhaCungCap VARCHAR(10) NOT NULL,
	TenNhaCungCap NVARCHAR(40) NOT NULL,
	DiaChi NVARCHAR(100) NOT NULL,
	SDT VARCHAR(10) NOT NULL,
	Email VARCHAR(30) NOT NULL,
	GhiChu NVARCHAR(100),
	PRIMARY KEY(MaNhaCungCap)
)
--Create table SanPham
CREATE TABLE SanPham(
	MaSanPham INT IDENTITY(1,1) NOT NULL,
	TenSanPham NVARCHAR(30) NOT NULL,
	GiaBanRA DECIMAL(10,2) NOT NULL,
	SoLuongConLai INT NOT NULL,
	NhaSanXuat NVARCHAR(15) NOT NULL,
	MaNhaCungCap VARCHAR(10) NOT NULL,
	LoaiSanPham NVARCHAR(20) NOT NULL,
	HinhAnh NVARCHAR(30),
	GhiChu NVARCHAR(100),
	PRIMARY KEY(MaSanPham),
	CONSTRAINT FK_SanPham_MaNhaCungCap
	FOREIGN KEY (MaNhaCungCap) REFERENCES NhaCungCap(MaNhaCungCap)
)
--Create table NhanVien
CREATE TABLE NhanVien(
	MaNhanVien VARCHAR(10) NOT NULL,
	TenNhanVien NVARCHAR(30) NOT NULL,
	NgaySinh DATE NOT NULl,
	GioiTinh INT NOT NULL,
	SDT VARCHAR(10) NOT NULL,
	DiaChi NVARCHAR(100) NOT NULL,
	VaiTro INT NOT NULL,
	MatKhau VARCHAR(30) NOT NULL,
	Email VARCHAR(30) NOT NULL,
	Hinh VARCHAR(30),
	GhiChu NVARCHAR(100),
	PRIMARY KEY(MaNhanVien)
)
--Create table KhachHang
CREATE TABLE KhachHang(
	MaKhachHang INT IDENTITY(1,1) NOT NULL,
	TenKhachHang NVARCHAR(30) NOT NULL,
	NgaySinh DATE NOT NULL,
	GioiTinh INT NOT NULL,
	SDT VARCHAR(10) NOT NULL,
	Email VARCHAR(30) NOT NULL,
	DiaChi NVARCHAR(100) NOT NULL,
	GhiChu NVARCHAR(100),
	PRIMARY KEY(MaKhachHang)
)
--Create table HoaDon
CREATE TABLE HoaDon(
	MaHoaDon INT IDENTITY(1,1) NOT NULL,
	NgayMuaHang DATE NOT NULL,
	TrangThai NVARCHAR(30) NOT NULL,
	MaNhanVien VARCHAR(10) NOT NULL,
	MaKhachHang INT NOT NULL,
	GhiChu NVARCHAR(100),
	PRIMARY KEY(MaHoaDon),
	CONSTRAINT FK_HoaDon_MaNhanVien
	FOREIGN KEY (MaNhanVien) REFERENCES NhanVien(MaNhanVien),
	CONSTRAINT FK_HoaDon_MaKhachHang
	FOREIGN KEY (MaKhachHang) REFERENCES KhachHang(MaKhachHang)
)
--Create table HoaDonChiTiet
CREATE TABLE HoaDonChiTiet(
	MaHoaDonChiTiet INT IDENTITY(1,1) NOT NULL,
	MaSanPham INT NOT NULL,
	TenSanPham NVARCHAR(30) NOT NULL,
	MaHoaDon INT NOT NULL,
	SoLuong INT NOT NULL,
	DonGia DECIMAL(10,2) NOT NULL,
	PRIMARY KEY(MaHoaDonChiTiet),
	CONSTRAINT FK_HoaDonChiTiet_MaSanPham
	FOREIGN KEY (MaSanPham) REFERENCES SanPham(MaSanPham),
	CONSTRAINT FK_HoaDonChiTiet_MaHoaDon
	FOREIGN KEY (MaHoaDon) REFERENCES HoaDon(MaHoaDon) ON DELETE CASCADE
)

--Insert data into NhaCungCap
INSERT INTO NhaCungCap
VALUES('ABC',N'Công ty ABC',N'Thành phố Hồ Chí Minh','0985125474','abccompany@gmail.com',null),
	  ('XYZ',N'Công ty XYZ',N'Hà Nội','0158749625','companyxyz@gmail.com',null),
	  ('VT',N'Nhà cung cấp VT',N'Hải Phòng','0512697451','vt123company@gmail.com',null)

--Insert data into SanPham
INSERT INTO SanPham(TenSanPham,GiaBanRA,SoLuongConLai,NhaSanXuat,MaNhaCungCap,LoaiSanPham,HinhAnh,GhiChu)
VALUES('iPhone 11 Pro',2000,10,'Apple','ABC','Phone','iphone11pro.png',null),
	  ('Realme 7 Pro',800,5,'Realme','XYZ','Phone','realme_7_Pro.jpg',null),
	  ('Airpods 2 MV7N2',60,4,'Apple','VT','Headphone','apple-airpods.jpg',null),
	  (N'Cáp Lightning',40,8,'Xiaomi','VT','Cáp','cap-lightning.jpg',null),
	  ('Pin xiaomi 4200mah',100,20,'Xiaomi','ABC','Pin','pin_xiaomi_4200mah.png',null),
	  (N'Ốp lưng Iphone11 Da',48,50,'Apple','XYZ','Khác','op_lung_iphone11_da.jpg',null)

--Insert data into NhanVien. Giới tính: 1:Nam, 2:Nữ, 3:Khác. Vai trò: 1:Quản lý, 2:Nhân viên
INSERT INTO NhanVien
VALUES ('QLCH',N'Đỗ Tiến Thịnh','10-15-2002',1,'0864478965',N'TP Hồ Chí Minh',1,'songlong','thinhdtps15048@fpt.edu.vn','quanly.jpg',null),
	   ('NVBH',N'Nguyễn Đỗ Duy An','07-17-2002',1,'0962946658',N'TP Hà Nội',2,'123','anfnguyen113@gmail.com','nv1.jpg',null),
	   ('NVBH2',N'Nguyễn Đạt Văn','03-25-2002',1,'0925548867',N'TP Hồ Chí Minh',2,'123','vanndps15047@fpt.edu.vn','nv2.jpg',null),
	   ('NVBH3',N'Trần Gia Khang','06-13-2002',1,'0363456678',N'Tiền Giang',2,'123','khangtgps15054@fpt.edu.vn','nv3.jpg',null),
	   ('NVBH4',N'Trịnh Hữu Thiện Ân','08-20-2002',1,'0707896654',N'Hà Nội',2,'123','anthtps15011@fpt.edu.vn','nv4.png',null)	   
--Insert data into KhachHang. Giới tính: 1:Nam, 2:Nữ, 3:Khác
INSERT INTO KhachHang(TenKhachHang,NgaySinh,GioiTinh,SDT,Email,DiaChi,GhiChu)
VALUES(N'Đỗ Tiến Thịnh','10-21-2002',1,'0125478541','thinhdtps15048@fpt.edu.vn',N'Đồng Nai',null),
	  (N'Lý Mạc Sầu','12-02-2002',1,'0964588657','macsau@gmail.com',N'Cao Bằng',null),
	  (N'Lâm Triều Anh','12-02-2002',1,'0323365997','trieuanh@gmail.com',N'Bến Tre',null),
	  (N'Hồng Thất Công','12-02-2002',1,'0365547862','thatcong@gmail.com',N'Kiên Giang',null),
	  (N'Trương Tam Phong','12-02-2002',1,'0709633356','tamphong@gmail.com',N'Sóc Trăng',null),
	  (N'Quách Tương','12-02-2002',1,'0927759626','quachtuong@gmail.com',N'Bình Dương',null)
--Insert data into HoaDon
INSERT INTO HoaDon(NgayMuaHang,TrangThai,MaNhanVien,MaKhachHang,GhiChu)
VALUES('03-02-2019',N'Đã thanh toán','NVBH',1,null),

	  ('06-05-2020',N'Chưa thanh toán','NVBH',2,N'Lâu quá chưa thấy trả'),
	  ('05-18-2020',N'Đã thanh toán','NVBH',3,null),
	  ('04-06-2020',N'Đã thanh toán','NVBH',4,null),
	  ('07-15-2020',N'Đã thanh toán','NVBH2',5,null),
	  ('01-05-2020',N'Đã thanh toán','NVBH3',3,null),
	  ('02-18-2020',N'Đã thanh toán','NVBH4',2,null),
	  ('03-06-2020',N'Đã thanh toán','NVBH4',1,null),
	  ('08-15-2020',N'Đã thanh toán','NVBH2',5,null),
	  ('09-23-2020',N'Đã thanh toán','NVBH3',4,null),
	  ('10-05-2020',N'Đã thanh toán','NVBH',2,null),
	  ('11-18-2020',N'Đã thanh toán','NVBH',1,null),
	  ('12-06-2020',N'Chưa thanh toán','NVBH2',1,N'Chắc ăn tết xong trả'),	 
	  
	  ('07-23-2021',N'Đã thanh toán','NVBH4',3,null),
	  ('08-28-2021',N'Đã thanh toán','NVBH',2,null)
--Insert data into HoaDonChiTiet
INSERT INTO HoaDonChiTiet(MaSanPham,TenSanPham,MaHoaDon,SoLuong,DonGia)
VALUES(1,'iPhone 11 Pro',1,2,4000),
      (1,'iPhone 11 Pro',2,1,2000),
	  (2,'Realme 7 Pro',3,5,4000),
	  (3,'Airpods 2 MV7N2',4,7,420),
	  (4,N'Cáp Lightning',5,8,320),
	  (5,'Pin xiaomi 4200mah',6,12,1200),
	  (6,N'Ốp lưng Iphone11 Da',7,23,1104),
	  (6,N'Ốp lưng Iphone11 Da',8,12,576),
	  (1,'iPhone 11 Pro',9,5,10000),
	  (4,N'Cáp Lightning',10,30,1200),
	  (3,'Airpods 2 MV7N2',11,10,600),
	  (5,'Pin xiaomi 4200mah',12,27,2700),
	  (2,'Realme 7 Pro',13,45,36000),
	  (4,N'Cáp Lightning',14,23,920),
	  (6,N'Ốp lưng Iphone11 Da',15,70,3360),
	  (2,'Realme 7 Pro',15,50,40000)
--Create table HangChoNhap
CREATE TABLE HangChoNhap(
	MaLuotNhap INT IDENTITY(1,1) NOT NULL,
	MaSanPham INT NOT NULL,
	TenSanPham NVARCHAR(20) NOT NULL,
	SoLuong INT NOT NULL,
	DonGia DECIMAL(10) NOT NULL,
	PRIMARY KEY(MaLuotNhap)
)
