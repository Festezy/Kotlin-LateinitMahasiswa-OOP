class lateinitMahasiswaClass {

    lateinit var Nama: String
    lateinit var NIM: String
    lateinit var JURUSAN: String

    fun dataMahasiswalateinit(name: String, nim: String, jurusan: String){
        this.Nama = name
        this.NIM = nim
        this.JURUSAN = jurusan
    }

}
