package com.company;

public enum Days {
    ДУЙШОМБУ("Дуйшомбу куну: жава  сабагын окуймун."),
    ШЕЙШЕМБИ("Шейшемби куну: жава практика сабагын окуймун."),
    ШАРШЕМБИ("Шаршемби куну: жава жана жава практика сабактары окуймун."),
    БЕЙШЕМБИ("Бейшемби куну: жава жана софт скилл сабактарын окуймун."),
    ЖУМА("Жума куну: жава сабагын окуймун.");


    String regulations;

     Days(String regulations) {
      this.regulations = regulations;
  }

    public String getRegulations() {
        return regulations;
    }

    public boolean setRegulations(String regulations) {
        this.regulations = regulations;
        return false;
    }

    @Override
    public String toString() {
        return "Days" + "regulations='" + regulations;
    }
}
