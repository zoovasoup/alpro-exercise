#---
author: Kelompok 4 | SE-48-03 | Telkom University
date: Dec 16, 2024
paging: Page %d of %d

---

# Mini Tugas ALPRO

```
            ______  __      ______  ______  ______
           /\  __ \/\ \    /\  == \/\  == \/\  __ \
           \ \  __ \ \ \___\ \  _-/\ \  __<\ \ \/\ \
            \ \_\ \_\ \_____\ \_\   \ \_\ \_\ \_____\
             \/_/\/_/\/_____/\/_/    \/_/ /_/\/_____/
      ______  ______  __      __  __  __   ______  ______  __
     /\  __ \/\  == \/\ \    /\ \/\ \/ /  /\  __ \/\  ___\/\ \
     \ \  __ \ \  _-/\ \ \___\ \ \ \  _"-.\ \  __ \ \___  \ \ \
      \ \_\ \_\ \_\   \ \_____\ \_\ \_\ \_\\ \_\ \_\/\_____\ \_\
       \/_/\/_/\/_/    \/_____/\/_/\/_/\/_/ \/_/\/_/\/_____/\/_/
 __  __   ______  ______  ______  __  __  ______  ______  ______  __   __
/\ \/ /  /\  ___\/\  ___\/\  ___\/\ \_\ \/\  __ \/\__  _\/\  __ \/\ "-.\ \
\ \  _"-.\ \  __\\ \___  \ \  __\\ \  __ \ \  __ \/_/\ \/\ \  __ \ \ \-.  \
 \ \_\ \_\\ \_____\/\_____\ \_____\ \_\ \_\ \_\ \_\ \ \_\ \ \_\ \_\ \_\\"\_\
  \/_/\/_/ \/_____/\/_____/\/_____/\/_/\/_/\/_/\/_/  \/_/  \/_/\/_/\/_/ \/_/
```

---

# Anggota Kelompok

| nama                           | NIM          | Role            |
| ------------------------------ | ------------ | --------------- |
| Fauzan Zulfa Muhammad          | 103022400032 | Anak Magang     |
| Faiq Prabaswara A              | 103022400130 | Senior Dev      |
| Nathan Manggala                | 103022400050 | Project Manager |
| Muhammad Dhaifullah Safarullah | 103022400068 | Lead Dev        |
| ------------------------------ | ------------ | --------------- |

---

# Deskripsi Aplikasi

Aplikasi ini digunakan oleh suster suatu klinik. Data yang diolah adalah data lama konsultasi antara pasien dan dokter sehingga muncul harga konsultasi.

---

# Spesifikasi

## Umum

- Program dibuat secara modular atau dengan menggunakan subprogram (procedure dan function) minimal sebanyak 3 procedure atau function.
- Implementasikan penggunaan Array 1 dimensi dan Array 2 dimensi yang digunakan adalah array statis, bukan array dinamis atau slice.
- Pengunaan variabel global hanya diperbolehkan untuk data array-array utama yang akan diolah saja.

## Utama

- Pengguna harus bisa melakukan menginput dan menghapus data nama pasien, nama dokter, jam masuk, jam keluar.
- Pengguna harus bisa melakukan pengubahan (edit) data dokter, jam masuk, jam keluar
- Data harga konsultasi muncul dengan perhitungan 60 menit awal Rp. 50.000 dan 30 menit selanjutnya 10.000 dengan pembulatan waktu ke atas (ex 31 menit 20.000)
- Pengguna bisa menampilkan nama pasien beserta data konsultasinya
- Pengguna bisa menampilkan nama pasien dengan bayaran terbesar

## tambahan

- Program mem-validasi input yang diberikan oleh user
- Pengguna dapat menampilkan data seorang pasien dan data seluruh pasien
- Pengguna dapat menghapus dan menambah data dokter

---

# Program flow

```
┌───────┐      ┌──────────────────────┐           ┌────────────────┐
│ start ├──┬──►│ input data           │     ┌────►│ tambah dokter  │
└───────┘  │   └──────────────────────┘     │     └────────────────┘
           │                                │
           │   ┌──────────────────────┐     │     ┌────────────────┐
           ├──►│ edit data dokter     ├─────┴────►│ hapus dokter   │
           │   └──────────────────────┘           └────────────────┘
           │
           │   ┌──────────────────────┐
           ├──►│ hapus data pasien    │
           │   └──────────────────────┘
           │
           │   ┌──────────────────────┐                                      ┌────────────────┐
           ├──►│ edit data pasien     ├────────────────────────────────┬────►│ nama pasien    │
           │   └──────────────────────┘                                │     └────────────────┘
           │                                                           │
           │   ┌──────────────────────┐           ┌────────────────┐   │     ┌────────────────┐
           ├──►│ tampil data          ├─────┬────►│ semua          │   ├────►│ nama dokter    │
           │   └──────────────────────┘     │     └────────────────┘   │     └────────────────┘
           │                                │                          │
           │   ┌──────────────────────┐     │     ┌────────────────┐   │     ┌────────────────┐
           ├──►│ tampil data terbesar │     └────►│ tertentu       │   ├────►│ waktu masuk    │
           │   └──────────────────────┘           └────────────────┘   │     └────────────────┘
           │                                                           │
           │   ┌──────────────────────┐                                │     ┌────────────────┐
           └──►│ exit                 │                                └────►│ waktu keluar   │
               └──────────────────────┘                                      └────────────────┘
```

---

# Demo

```


                  ____    ____             _____
                 /\  _`\ /\  _`\   /'\_/`\/\  __`\
                 \ \ \/\ \ \ \L\_\/\      \ \ \/\ \
                  \ \ \ \ \ \  _\L\ \ \__\ \ \ \ \ \
                   \ \ \_\ \ \ \L\ \ \ \_/\ \ \ \_\ \
                    \ \____/\ \____/\ \_\\ \_\ \_____\
                     \/___/  \/___/  \/_/ \/_/\/_____/
                                 ____
                               /|  _ \
                               |/\   |
                                \// __`\/\
                                /|  \L>  <_
                                | \_____/\/
                                 \/____/\/
 ____     ____    ____    ______  __  __   ____    _____   __      __  __  __
/\  _`\  /\  _`\ /\  _`\ /\  _  \/\ \/\ \ /\  _`\ /\  __`\/\ \  __/\ \/\ \/\ \
\ \ \L\ \\ \ \L\ \ \ \L\_\ \ \L\ \ \ \/'/'\ \ \/\ \ \ \/\ \ \ \/\ \ \ \ \ `\\ \
 \ \  _ <'\ \ ,  /\ \  _\L\ \  __ \ \ , <  \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ , ` \
  \ \ \L\ \\ \ \\ \\ \ \L\ \ \ \/\ \ \ \\`\ \ \ \_\ \ \ \_\ \ \ \_/ \_\ \ \ \`\ \
   \ \____/ \ \_\ \_\ \____/\ \_\ \_\ \_\ \_\\ \____/\ \_____\ `\___x___/\ \_\ \_\
    \/___/   \/_/\/ /\/___/  \/_/\/_/\/_/\/_/ \/___/  \/_____/'\/__//__/  \/_/\/_/




```

---

# Penutup

---
