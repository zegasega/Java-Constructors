class Araba:
    def __init__(self, marka, model, renk):
        # __init__ fonksiyonu, nesnenin başlangıç durumunu ayarlamak için kullanılır
        self.marka = marka
        self.model = model
        self.renk = renk
        self.hiz = 0  # Başlangıçta aracın hızı sıfırdır

    def hizi_goster(self):
        print(f"{self.marka} {self.model}'nin hızı: {self.hiz} km/saat")

    def hizlan(self, artis):
        self.hiz += artis
        print(f"{self.marka} {self.model} hızlandı! Yeni hız: {self.hiz} km/saat")

# Araba sınıfından bir nesne oluşturalım
araba1 = Araba("Toyota", "Corolla", "Mavi")

# Arabanın başlangıç durumunu gösterelim
araba1.hizi_goster()

# Arabayı hızlandıralım
araba1.hizlan(20)

# Yeni hızı gösterelim
araba1.hizi_goster()
