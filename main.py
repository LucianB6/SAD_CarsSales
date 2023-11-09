import tkinter as tk
from tkinter import ttk
from matplotlib.figure import Figure
from matplotlib.backends.backend_tkagg import FigureCanvasTkAgg


# Funcția pentru a genera diagrama în funcție de datele introduse
def generate_plot_fct1():
    # Obțineți datele din câmpurile de text
    x_data = entry_asociere1_1.get().split(',')
    y_data = entry_asociere1_2.get().split(',')

    # Converteșteți datele în liste de numere
    x_values = [float(x.strip()) for x in x_data if x.strip().replace('.', '', 1).isdigit()]
    y_values = [float(y.strip()) for y in y_data if y.strip().replace('.', '', 1).isdigit()]

    # Anulați graficul anterior (dacă există)
    plot.clear()
    # Desenați un grafic simplu (de exemplu, un grafic de linie)
    plot.plot(x_values, y_values)
    # Actualizați canvas-ul pentru a afișa diagrama
    canvas.draw()


def generate_plot_fct2():
    # Obțineți datele din câmpurile de text
    x_data = entry_asociere1_1.get().split(',')
    y_data = entry_asociere1_2.get().split(',')

    # Converteșteți datele în liste de numere
    x_values = [float(x.strip()) for x in x_data if x.strip().replace('.', '', 1).isdigit()]
    y_values = [float(y.strip()) for y in y_data if y.strip().replace('.', '', 1).isdigit()]

    # Anulați graficul anterior (dacă există)
    plot.clear()
    # Desenați un grafic simplu (de exemplu, un grafic de linie)
    plot.plot(x_values, y_values)
    # Actualizați canvas-ul pentru a afișa diagrama
    canvas.draw()


def generate_plot_fct3():
    # Obțineți datele din câmpurile de text
    x_data = entry_asociere1_1.get().split(',')
    y_data = entry_asociere1_2.get().split(',')

    # Converteșteți datele în liste de numere
    x_values = [float(x.strip()) for x in x_data if x.strip().replace('.', '', 1).isdigit()]
    y_values = [float(y.strip()) for y in y_data if y.strip().replace('.', '', 1).isdigit()]

    # Anulați graficul anterior (dacă există)
    plot.clear()
    # Desenați un grafic simplu (de exemplu, un grafic de linie)
    plot.plot(x_values, y_values)
    # Actualizați canvas-ul pentru a afișa diagrama
    canvas.draw()


def generate_plot_fct4():
    # Obțineți datele din câmpurile de text
    x_data = entry_asociere1_1.get().split(',')
    y_data = entry_asociere1_2.get().split(',')

    # Converteșteți datele în liste de numere
    x_values = [float(x.strip()) for x in x_data if x.strip().replace('.', '', 1).isdigit()]
    y_values = [float(y.strip()) for y in y_data if y.strip().replace('.', '', 1).isdigit()]

    # Anulați graficul anterior (dacă există)
    plot.clear()
    # Desenați un grafic simplu (de exemplu, un grafic de linie)
    plot.plot(x_values, y_values)
    # Actualizați canvas-ul pentru a afișa diagrama
    canvas.draw()


def generate_plot_fct5():
    # Obțineți datele din câmpurile de text
    x_data = entry_asociere1_1.get().split(',')
    y_data = entry_asociere1_2.get().split(',')

    # Converteșteți datele în liste de numere
    x_values = [float(x.strip()) for x in x_data if x.strip().replace('.', '', 1).isdigit()]
    y_values = [float(y.strip()) for y in y_data if y.strip().replace('.', '', 1).isdigit()]

    # Anulați graficul anterior (dacă există)
    plot.clear()
    # Desenați un grafic simplu (de exemplu, un grafic de linie)
    plot.plot(x_values, y_values)
    # Actualizați canvas-ul pentru a afișa diagrama
    canvas.draw()


def show_input_fields_functionalitate1():
    # Afișează câmpurile de text pentru introducerea datelor
    label_asociere1_1.pack()
    entry_asociere1_1.pack()
    label_asociere1_2.pack()
    entry_asociere1_2.pack()
    generate_button_fct1.pack()


def show_input_fields_functionalitate2():
    # Afișează câmpurile de text pentru introducerea datelor
    label_asociere1_1.pack()
    entry_asociere1_1.pack()
    label_asociere1_2.pack()
    entry_asociere1_2.pack()
    generate_button_fct1.pack()


def show_input_fields_functionalitate3():
    # Afișează câmpurile de text pentru introducerea datelor
    label_asociere1_1.pack()
    entry_asociere1_1.pack()
    label_asociere1_2.pack()
    entry_asociere1_2.pack()
    generate_button_fct1.pack()


def show_input_fields_functionalitate4():
    # Afișează câmpurile de text pentru introducerea datelor
    label_asociere1_1.pack()
    entry_asociere1_1.pack()
    label_asociere1_2.pack()
    entry_asociere1_2.pack()
    generate_button_fct1.pack()


def show_input_fields_functionalitate5():
    # Afișează câmpurile de text pentru introducerea datelor
    label_asociere1_1.pack()
    entry_asociere1_1.pack()
    label_asociere1_2.pack()
    entry_asociere1_2.pack()
    generate_button_fct1.pack()


# Funcția pentru a ascunde câmpurile de text și butonul de generare a diagramei
def hide_input_fields():
    # Ascunde câmpurile de text pentru introducerea datelor
    label_asociere1_1.pack_forget()
    entry_asociere1_1.pack_forget()
    label_asociere1_2.pack_forget()
    entry_asociere1_2.pack_forget()
    generate_button_fct1.pack_forget()


# Funcția pentru a afișa un mesaj pentru fiecare buton și a arăta câmpurile de text
def button_click(button_num):
    message_label.config(text=f"Ai apăsat butonul {button_num}")
    if button_num == 1:
        hide_input_fields()
        show_input_fields_functionalitate1()
    else:
        hide_input_fields()

# Inițializați interfața grafică
window = tk.Tk()
window.title("Mini Aplicație Python")

# Creați o figură și un subplot pentru diagramă
fig = Figure(figsize=(5, 4), dpi=100)
plot = fig.add_subplot(1, 1, 1)

# Creați canvas-ul pentru a afișa diagrama
canvas = FigureCanvasTkAgg(fig, master=window)
canvas.get_tk_widget().pack()

# Etichetă și câmpuri de text pentru introducerea datelor
label_asociere1_1 = ttk.Label(window, text="Functionalitate1.1")
entry_asociere1_1 = ttk.Entry(window)

label_asociere1_2 = ttk.Label(window, text="Functionalitate1.2")
entry_asociere1_2 = ttk.Entry(window)

label_asociere2_1 = ttk.Label(window, text="Functionalitate2.1")
entry_asociere2_1 = ttk.Entry(window)

label_asociere2_2 = ttk.Label(window, text="Functionalitate2.2")
entry_asociere2_2 = ttk.Entry(window)

label_asociere3_1 = ttk.Label(window, text="Functionalitate3.1")
entry_asociere3_1 = ttk.Entry(window)

label_asociere3_2 = ttk.Label(window, text="Functionalitate3.2")
entry_asociere3_2 = ttk.Entry(window)

label_asociere4_1 = ttk.Label(window, text="Functionalitate4.1")
entry_asociere4_1 = ttk.Entry(window)

label_asociere4_2 = ttk.Label(window, text="Functionalitate4.2")
entry_asociere4_2 = ttk.Entry(window)

label_asociere5_1 = ttk.Label(window, text="Functionalitate5.1")
entry_asociere5_1 = ttk.Entry(window)

label_asociere5_2 = ttk.Label(window, text="Functionalitate5.2")
entry_asociere5_2 = ttk.Entry(window)

generate_button_fct1 = ttk.Button(window, text="Generează Diagrama", command=generate_plot_fct1)
generate_button_fct2 = ttk.Button(window, text="Generează Diagrama", command=generate_plot_fct2)
generate_button_fct3 = ttk.Button(window, text="Generează Diagrama", command=generate_plot_fct3)
generate_button_fct4 = ttk.Button(window, text="Generează Diagrama", command=generate_plot_fct4)
generate_button_fct5 = ttk.Button(window, text="Generează Diagrama", command=generate_plot_fct5)

message_label = tk.Label(window, text="")
message_label.pack()

button_container = ttk.Frame(window)
button_container.pack(side=tk.TOP, fill=tk.X, expand=True)

for i in range(1, 6):
    button = ttk.Button(button_container, text=f"Funcționalitatea {i}", command=lambda i=i: button_click(i))
    button.pack(side=tk.LEFT, fill=tk.X, expand=True)

window.mainloop()
