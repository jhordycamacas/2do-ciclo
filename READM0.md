# Evaluación práctica: Análisis Exploratorio de Datos (EDA)
## Rendimiento de futbolistas por temporada y competición

**Asignatura:** Programación Avanzada · UTPL
**Modalidad:** Individual · **Duración:** 3 horas · **Puntaje total:** 20 puntos
**Herramientas:** Apache Zeppelin + Spark (Scala o PySpark) para el EDA sobre el dataset completo, y pandas + matplotlib/seaborn para visualizaciones específicas.

---

## Contexto

Trabajarás con un dataset real de rendimiento de futbolistas que contiene **1.878.719 registros** y 19 columnas. Cada fila describe el desempeño de un jugador en una **temporada** y **competición** concretas (goles, asistencias, tarjetas, minutos jugados, etc.).

Tu tarea es realizar un **EDA completo** que demuestre tu dominio del proceso (carga, limpieza, exploración y comunicación) y de las herramientas del curso. Como el volumen es grande, el EDA se hace en **Spark**; para los gráficos que Zeppelin no soporta, llevarás datos **reducidos** a pandas.

## Esquema del dataset

| Columna | Tipo | Descripción |
|---|---|---|
| `player_id` | entero | identificador del jugador |
| `player_name` | texto | nombre del jugador |
| `date_of_birth` | fecha | fecha de nacimiento |
| `country_of_birth` | texto | país de nacimiento |
| `main_position` | texto | posición principal (Attack, Midfield, Defender, Goalkeeper) |
| `foot` | texto | pie hábil |
| `outfitter` | texto | marca patrocinadora |
| `season_name` | texto | temporada (ej. `99/00`) |
| `competition_name` | texto | competición |
| `team_name` | texto | equipo |
| `goals` | entero | goles anotados |
| `assists` | entero | asistencias |
| `own_goals` | entero | autogoles |
| `yellow_cards` | entero | tarjetas amarillas |
| `second_yellow_cards` | entero | segundas amarillas |
| `direct_red_cards` | entero | rojas directas |
| `penalty_goals` | entero | goles de penal |
| `minutes_played` | entero | minutos jugados |
| `goals_conceded` | entero | **goles encajados** (métrica de porteros: goles recibidos por el equipo con ese jugador en el campo) |

> **Nota sobre el archivo:** el CSV usa **`;`** como separador. Presta atención a la codificación de los campos de texto y a los valores que representan datos ausentes.

---

## Instrucciones generales

- Usa la nota de Zeppelin plantilla que se te entrega (`evaluacion_futbol_plantilla.zpln`) como punto de partida; complétala.
- Cada bloque de análisis debe ir acompañado de una **celda de texto (`%md`) con tu interpretación**. Un gráfico o una tabla sin lectura no puntúa completo: lo que se evalúa es que *entiendas* lo que muestras.
- Para los gráficos de matplotlib en Zeppelin usa `z.show(plt, width='100%')`.
- **Regla de oro con `toPandas()`:** reduce siempre en Spark (agrega, filtra o muestrea) antes de traer datos a pandas. Nunca traigas el dataset completo.

---

## Parte 1 — Carga y primer contacto (2 puntos)

1. Carga el dataset en Spark con las opciones correctas.
2. Reporta las **dimensiones** (filas y columnas) y muestra el **esquema**.
3. Muestra las primeras filas y describe brevemente, con tus palabras, qué representa una fila.

## Parte 2 — Calidad y limpieza de datos (4 puntos)

1. Cuantifica los **valores nulos** por columna.
2. Detecta y trata al menos **dos problemas de calidad** distintos que encuentres en los datos de texto (obsérvalos con atención: no todo lo que parece un valor válido lo es, y no todos los datos ausentes aparecen como nulos).
3. Verifica la presencia de **duplicados** y decide qué hacer.
4. **Justifica cada decisión de limpieza** en una celda de texto (por qué eliminar, imputar o conservar). No se trata de "limpiar por limpiar".

## Parte 3 — EDA univariado con gráficos nativos de Zeppelin (3 puntos)

Analiza variables **de a una**, usando gráficos `%sql` de Zeppelin (barras, líneas, etc.):

1. Distribución de una variable **categórica** (ej. posición, pie hábil o competición).
2. Distribución de una variable **numérica** relevante (ej. goles o minutos), reportando medidas de tendencia central y dispersión.
3. Interpreta cada resultado: ¿qué forma tiene la distribución? ¿hay algo llamativo?

## Parte 4 — EDA bivariado / multivariado (3 puntos)

Explora **relaciones** entre variables. De forma obligatoria, incluye **al menos un análisis segmentado por posición** (`main_position`), y reflexiona sobre por qué algunas métricas solo tienen sentido para ciertas posiciones. Otras ideas válidas: goles vs. minutos, tarjetas por competición, evolución de una métrica a lo largo de las temporadas.

## Parte 5 — Visualizaciones avanzadas con pandas + matplotlib/seaborn (3 puntos)

Usando el patrón **Spark reduce → pandas grafica**, genera **al menos dos gráficos que Zeppelin `%sql` no soporta**, por ejemplo:

- un **boxplot (diagrama de Tukey)** de alguna métrica, idealmente comparando posiciones;
- un **histograma con densidad (KDE)**, un **violín** o un **mapa de calor de correlaciones**.

Explica por qué elegiste ese gráfico y qué revela que una tabla no mostraría.

## Parte 6 — Tu propia pregunta de investigación (3 puntos)

Formula **una pregunta interesante que se pueda responder con este dataset** y respóndela con datos y al menos un gráfico. La pregunta debe demostrar que entiendes qué información contiene el dataset y qué se puede (y no se puede) inferir de él. Se valorará la **originalidad** y la **solidez** del análisis, no la complejidad por sí misma.

*Ejemplos para inspirarte (no los copies literalmente): ¿qué posición acumula más tarjetas por minuto jugado? ¿cómo se comparan los goles de penal frente a los goles de jugada por competición? ¿los porteros de qué competición encajan menos goles?*

## Parte 7 — Reto de análisis: métricas normalizadas (1 punto)

Los conteos brutos (goles totales) favorecen a quien más juega. Una técnica habitual en la analítica deportiva es **normalizar "por 90 minutos"**: `goles_por_90 = goles / (minutes_played / 90)`.

1. Calcula esta métrica.
2. Ordena de mayor a menor y **observa críticamente los resultados**: ¿todos tienen sentido? Si encuentras valores imposibles o sospechosos, explica **a qué se deben** y **qué precaución** tomarías para que la métrica sea confiable.

## Parte 8 — Conclusiones y comunicación (1 punto)

Cierra con 4-6 conclusiones claras que respondan a lo que descubriste. Un buen EDA no termina en gráficos, sino en **conocimiento**. Se evalúa también el orden, la claridad y la comunicación general de toda la nota.

---

## Distribución de tiempo sugerida (3 horas)

| Bloque | Tiempo aprox. |
|---|---|
| Partes 1 y 2 (carga y limpieza) | 45 min |
| Parte 3 (univariado) | 30 min |
| Parte 4 (bivariado) | 30 min |
| Parte 5 (viz avanzada) | 30 min |
| Parte 6 (pregunta propia) | 30 min |
| Partes 7 y 8 (reto y conclusiones) | 15 min |

## Entregables

- La **nota de Zeppelin completada** (exportada como `.zpln` o el enlace, según indique tu docente), con todas las celdas ejecutadas y sus salidas visibles.
- Cada parte con su análisis en texto correspondiente.

## Recomendaciones finales

- Ejecuta la nota completa de arriba abajo antes de entregar (*Run all paragraphs*) para asegurar que todo refleja el estado final.
- La calidad de la interpretación pesa tanto como el código. Explica siempre *qué* ves y *por qué* importa.
- Ante un valor extraño, no lo borres sin más: investiga si es un error o un dato real e interesante.

*¡Éxitos! Recuerda que el objetivo no es "hacer muchos gráficos", sino contar una historia coherente con los datos.*
