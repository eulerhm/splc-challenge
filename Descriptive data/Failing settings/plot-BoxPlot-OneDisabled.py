import pandas as pd
import matplotlib.pyplot as plt

my_data = pd.Series([11, 8, 13, 11, 11, 8, 14, 9, 8, 7, 9, 8, 10, 12])
my_data.plot(kind = 'box', title = 'One-Disabled', ylabel = 'Failures', use_index = False)
plt.show()
