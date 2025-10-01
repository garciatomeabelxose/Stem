# **Apuntes ED**

## **Comandos de git**

### **Instalacion de Git**

#### **Linux**

```bash
sudo apt update
sudo apt install git
```

#### **MacOS**

```bash
brew install git
```

## **Como crear un repositorio en Git**

### **Configuración y asociación de cuenta**

```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tuemail@ejemplo.com"
```

### **Como crear un repositorio local**

```bash
git init
```

### **Agregar archivos al área de preparación**

```bash
git add archivo.txt
```

### **Para agregar todos los archivos modificados o nuevos**

```bash
git add .
```

### **Hacer un commit (confirmar cambios)**

```bash
git commit -m "Descripción del cambio"
```

### **Ver el estado actual del repositorio con git status**

```bash
git status
```

### **Ver el historial de commits con git log**

```bash
git log
```
## **https://shiba-tools.dev/en/tools/commit-support-original**

### **Conectar un Repositorio Local con GitHub**

```bash
git remote add origin https://github.com/usuario/repo.git
```

### **subir Cambios al Repositorio Remoto con git push**

```bash
git push origin master
```

### **Clonar un Repositorio con git clone**

```bash
git clone https://github.com/usuario/repo.git
```

## **Comandos para trabajar con ramas**

### **Crear una nueva rama**

```bash
git branch nombre_rama
```

### **Cambiar a una rama existente**

```bash
git checkout nombre_rama
```

### **Crear y cambiar a una nueva rama en un solo paso**

```bash
git checkout -b nombre_rama
```

### **Fusionar Ramas: git merge**

```bash
git merge nombre_rama
```

### **Resolver Conflictos de Fusión**

#### **1. Abre los archivos en conflicto. Verás que Git ha marcado las secciones en conflicto con delimitadores como <<<<<<< , ======= , y >>>>>>> .Revisa ambos cambios y edita el archivo para resolver el conflicto. Una vez resuelto, agrega los archivos modificados al área de preparación (git add archivo.txt). Haz un commit para finalizar la fusión:**

```bash
git commit -m "Resolver conflicto en archivo.txt"
```

## **Pull Requests y Revisión de Código en GitHub**

### **Cómo crear una pull request en GitHub**

```bash
git push origin nombre_rama
```

## **Conceptos Avanzados en Git**

### **Deshacer Cambios: git reset y git revert**

```bash
git reset --soft HEAD^
```

```bash
git reset --hard HEAD^
```

### **Revertir un commit sin alterar el historial**

```bash
git revert <commit_id>
```

## **Git Stash: Guardar Cambios Temporalmente**

### **Guardar cambios temporalmente**

```bash
git stash
```

### **Recuperar los cambios guardados**

```bash
git stash pop
```