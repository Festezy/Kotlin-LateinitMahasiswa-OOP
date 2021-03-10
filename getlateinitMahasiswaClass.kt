fun main() {
    var dataMahasiswaLateinit = lateinitMahasiswaClass()
    dataMahasiswaLateinit.dataMahasiswalateinit("Andrean", "123789", "TIK")

    println("""
            Data Mahasiswa
        Nama    : ${dataMahasiswaLateinit.Nama}
        NIM     : ${dataMahasiswaLateinit.NIM}
        Jurusan : ${dataMahasiswaLateinit.JURUSAN}
    """.trimIndent())
}
