import pandas as pd
import matplotlib.pyplot as plt

my_data = pd.Series([37, 35, 38, 38, 38, 24, 37, 37, 38, 19, 38, 31, 38, 38])
my_data.plot(kind = 'box', title = 'One-Enabled', ylabel = 'Failures', use_index = False)
plt.show()
