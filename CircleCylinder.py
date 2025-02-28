import math

# Superclass Circle
class Circle:
    def __init__(self, radius):
        self.radius = radius  # Initialize the radius

    def getArea(self):
        # Area of a circle: π * r^2
        area = math.pi * (self.radius ** 2)
        return area


# Subclass Cylinder, derived from Circle
class Cylinder(Circle):
    def __init__(self, radius, height):
        # Initialize the radius using the superclass constructor
        super().__init__(radius)
        self.height = height  # Initialize the height specific to the Cylinder

    def getArea(self):
        # Override getArea method to calculate the surface area of the cylinder
        # Surface area of a cylinder: 2 * π * r * (r + h)
        area = 2 * math.pi * self.radius * (self.radius + self.height)
        return area

    def getVolume(self):
        # Volume of a cylinder: π * r^2 * h
        volume = math.pi * (self.radius ** 2) * self.height
        return volume


# Create an object of Cylinder class
cylinder = Cylinder(5, 10)

# Get and print the area and volume of the cylinder
print(f"Surface Area of Cylinder: {cylinder.getArea():.2f}")
print(f"Volume of Cylinder: {cylinder.getVolume():.2f}")
