#!/bin/bash
mkdir -p "$HOME/proyecto" "$HOME/proyecto/docs" "$HOME/proyecto/src" "$HOME/proyecto/config" "$HOME/proyecto/logs" "$HOME/proyecto/test"
mkdir -p "$HOME/proyecto/docs/manual.txt" "$HOME/proyecto/docs/guia.txt" "$HOME/proyecto/docs/referencias.txt"
mkdir -p "$HOME/proyecto/src/script1.sh" "$HOME/proyecto/src/script2.sh" "$HOME/proyecto/src/modulos" "$HOME/proyecto/src/modulos/modulo1.py"  
mkdir -p "$HOME/proyecto/config/app.cfg" "$HOME/proyecto/config/db.cfg"
mkdir -p "$HOME/proyecto/logs/access.log" "$HOME/proyecto/logs/error.log" "$HOME/proyecto/logs/backup" "$HOME/proyecto/logs/backup/backup.log"
mkdir -p "$HOME/proyecto/test/test1.txt" "$HOME/proyecto/test/test2.txt" "$HOME/proyecto/test/resultados" "$HOME/proyecto/test/resultados/resultados.txt"


mkdir -p "$HOME/proyecto/docs/backup_docs"
cp "$HOME/proyecto/docs/manual.txt" "$HOME/proyecto/backup_docs"
cp "$HOME/proyecto/docs/guia.txt" "$HOME/proyecto/backup_docs"


mkdir -p "$HOME/proyecto/docs/config_backup"
cp "$HOME/proyecto/config" "$HOME/proyecto/docs/config_backup"


mv "$HOME/proyecto/src/script1.sh" "$HOME/proyecto/test/resultados"
mv "$HOME/proyecto/src/script2.sh" "$HOME/proyecto/src/script_final.sh"
mv  "$HOME/proyecto/logs/backup" "$HOME/proyecto/test"



